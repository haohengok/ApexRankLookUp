package bean

data class ApexResponseMap(
    val battle_royale: BattleRoyale,
    val ranked: Ranked,
    val ltm: limited
)

data class BattleRoyale(
    val current: CurrentXX,
    val next: NextXX
)

data class Ranked(
    val current: CurrentXXXX,
    val next: NextXXXX
)

data class limited(
    val current: CurrentXXXXX,
    val next: NextXXXXX

)

data class CurrentXX(
    val DurationInMinutes: Int,
    val DurationInSecs: Int,
    val asset: String,
    val code: String,
    val end: Int,
    val map: String,
    val readableDate_end: String,
    val readableDate_start: String,
    val remainingMins: Int,
    val remainingSecs: Int,
    val remainingTimer: String,
    val start: Int
)

data class NextXX(
    val DurationInMinutes: Int,
    val DurationInSecs: Int,
    val code: String,
    val end: Int,
    val map: String,
    val readableDate_end: String,
    val readableDate_start: String,
    val start: Int
)

data class CurrentXXXX(
    val code: String,
    val asset: String,
    val map: String,
    val remainingTimer: String
)

data class NextXXXX(
    val map: String
)

data class CurrentXXXXX(
    val map: String,
    val asset: String,
    val eventName: String,
    val remainingTimer: String,
    val code: String
)

data class NextXXXXX(
    val map: String,
    val eventName: String
)

