package com.example

import io.quarkus.arc.deployment.AdditionalBeanBuildItem
import io.quarkus.deployment.annotations.BuildStep
import io.quarkus.deployment.builditem.FeatureBuildItem

class ExtensionProcessor {
  @BuildStep
  fun feature(): FeatureBuildItem {
    return FeatureBuildItem(FEATURE)
  }

  @BuildStep
  fun registerBeans(): AdditionalBeanBuildItem {
    return AdditionalBeanBuildItem.builder()
      .addBeanClass(ExampleService::class.java)
      .build()
  }

  companion object {
    private const val FEATURE = "example-extension"
  }
}
