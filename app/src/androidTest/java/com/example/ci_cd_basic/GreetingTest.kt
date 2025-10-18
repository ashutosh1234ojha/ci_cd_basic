package com.example.ci_cd_basic

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GreetingTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun greeting_displaysCorrectText() {
        // Arrange
        val testName = "Ashutosh"

        // Act
        composeTestRule.setContent {
            Greeting(name = testName)
        }

        // Assert
        composeTestRule
            .onNodeWithText("Hello $testName!")
            .assertIsDisplayed()
    }

}
