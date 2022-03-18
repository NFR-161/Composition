package com.exampleone.composition.domain.repository

import com.exampleone.composition.domain.entity.GameSettings
import com.exampleone.composition.domain.entity.Level
import com.exampleone.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}