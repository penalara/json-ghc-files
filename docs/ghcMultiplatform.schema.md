# GhcMultiplatformSchema

- [1. Property `GhcMultiplatformSchema > id`](#id)
- [2. Property `GhcMultiplatformSchema > meta`](#meta)
  - [2.1. Property `GhcMultiplatformSchema > meta > name`](#meta_name)
  - [2.2. Property `GhcMultiplatformSchema > meta > versionJson`](#meta_versionJson)
  - [2.3. Property `GhcMultiplatformSchema > meta > createdDate`](#meta_createdDate)
  - [2.4. Property `GhcMultiplatformSchema > meta > lastModifiedDate`](#meta_lastModifiedDate)
  - [2.5. Property `GhcMultiplatformSchema > meta > refUser`](#meta_refUser)
  - [2.6. Property `GhcMultiplatformSchema > meta > source`](#meta_source)
  - [2.7. Property `GhcMultiplatformSchema > meta > fullMode`](#meta_fullMode)
- [3. Property `GhcMultiplatformSchema > specifications`](#specifications)
  - [3.1. GhcMultiplatformSchema > specifications > PlannerSpecification](#specifications_items)
    - [3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > modifiedDate`](#specifications_items_modifiedDate)
    - [3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData`](#specifications_items_planningData)
      - [3.1.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods`](#specifications_items_planningData_periods)
        - [3.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > followedPeriods`](#specifications_items_planningData_periods_followedPeriods)
        - [3.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList`](#specifications_items_planningData_periods_periodsList)
          - [3.1.2.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period](#specifications_items_planningData_periods_periodsList_items)
            - [3.1.2.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > id`](#specifications_items_planningData_periods_periodsList_items_id)
            - [3.1.2.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > alias`](#specifications_items_planningData_periods_periodsList_items_alias)
            - [3.1.2.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > lastDay`](#specifications_items_planningData_periods_periodsList_items_lastDay)
            - [3.1.2.1.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases`](#specifications_items_planningData_periods_periodsList_items_dayAliases)
              - [3.1.2.1.2.1.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition](#specifications_items_planningData_periods_periodsList_items_dayAliases_items)
                - [3.1.2.1.2.1.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > dayId`](#specifications_items_planningData_periods_periodsList_items_dayAliases_items_dayId)
                - [3.1.2.1.2.1.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > alias`](#specifications_items_planningData_periods_periodsList_items_dayAliases_items_alias)
        - [3.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets`](#specifications_items_planningData_periods_periodSets)
          - [3.1.2.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet](#specifications_items_planningData_periods_periodSets_items)
            - [3.1.2.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet > id`](#specifications_items_planningData_periods_periodSets_items_id)
            - [3.1.2.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet > periodList`](#specifications_items_planningData_periods_periodSets_items_periodList)
              - [3.1.2.1.3.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet > periodList > periodList items](#specifications_items_planningData_periods_periodSets_items_periodList_items)
      - [3.1.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames`](#specifications_items_planningData_frames)
        - [3.1.2.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame](#specifications_items_planningData_frames_items)
          - [3.1.2.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > id`](#specifications_items_planningData_frames_items_id)
          - [3.1.2.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > exKey`](#specifications_items_planningData_frames_items_exKey)
          - [3.1.2.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days`](#specifications_items_planningData_frames_items_days)
            - [3.1.2.2.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay](#specifications_items_planningData_frames_items_days_items)
              - [3.1.2.2.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > day`](#specifications_items_planningData_frames_items_days_items_day)
              - [3.1.2.2.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections`](#specifications_items_planningData_frames_items_days_items_sections)
                - [3.1.2.2.1.3.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section](#specifications_items_planningData_frames_items_days_items_sections_items)
                  - [3.1.2.2.1.3.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > index`](#specifications_items_planningData_frames_items_days_items_sections_items_index)
                  - [3.1.2.2.1.3.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > entryTime`](#specifications_items_planningData_frames_items_days_items_sections_items_entryTime)
                  - [3.1.2.2.1.3.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > exitTime`](#specifications_items_planningData_frames_items_days_items_sections_items_exitTime)
                  - [3.1.2.2.1.3.1.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > exKey`](#specifications_items_planningData_frames_items_days_items_sections_items_exKey)
                  - [3.1.2.2.1.3.1.2.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > duration`](#specifications_items_planningData_frames_items_days_items_sections_items_duration)
                  - [3.1.2.2.1.3.1.2.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > type`](#specifications_items_planningData_frames_items_days_items_sections_items_type)
                  - [3.1.2.2.1.3.1.2.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > allowed`](#specifications_items_planningData_frames_items_days_items_sections_items_allowed)
      - [3.1.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings`](#specifications_items_planningData_buildings)
        - [3.1.2.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building](#specifications_items_planningData_buildings_items)
          - [3.1.2.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > id`](#specifications_items_planningData_buildings_items_id)
          - [3.1.2.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > fullName`](#specifications_items_planningData_buildings_items_fullName)
          - [3.1.2.3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances`](#specifications_items_planningData_buildings_items_distances)
            - [3.1.2.3.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances > Distance](#specifications_items_planningData_buildings_items_distances_items)
              - [3.1.2.3.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances > Distance > refBuilding`](#specifications_items_planningData_buildings_items_distances_items_refBuilding)
              - [3.1.2.3.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances > Distance > minutes`](#specifications_items_planningData_buildings_items_distances_items_minutes)
      - [3.1.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms`](#specifications_items_planningData_classRooms)
        - [3.1.2.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom](#specifications_items_planningData_classRooms_items)
          - [3.1.2.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > id`](#specifications_items_planningData_classRooms_items_id)
          - [3.1.2.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > shortName`](#specifications_items_planningData_classRooms_items_shortName)
          - [3.1.2.4.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > fullName`](#specifications_items_planningData_classRooms_items_fullName)
          - [3.1.2.4.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > isDedicated`](#specifications_items_planningData_classRooms_items_isDedicated)
          - [3.1.2.4.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > exKey`](#specifications_items_planningData_classRooms_items_exKey)
          - [3.1.2.4.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > capacity`](#specifications_items_planningData_classRooms_items_capacity)
          - [3.1.2.4.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate`](#specifications_items_planningData_classRooms_items_frameTemplate)
            - [3.1.2.4.1.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference](#specifications_items_planningData_classRooms_items_frameTemplate_items)
              - [3.1.2.4.1.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > day`](#specifications_items_planningData_classRooms_items_frameTemplate_items_day)
              - [3.1.2.4.1.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > index`](#specifications_items_planningData_classRooms_items_frameTemplate_items_index)
              - [3.1.2.4.1.7.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > frame`](#specifications_items_planningData_classRooms_items_frameTemplate_items_frame)
          - [3.1.2.4.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > refBuilding`](#specifications_items_planningData_classRooms_items_refBuilding)
          - [3.1.2.4.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > fullDay`](#specifications_items_planningData_classRooms_items_fullDay)
      - [3.1.2.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets`](#specifications_items_planningData_classRoomsSets)
        - [3.1.2.5.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet](#specifications_items_planningData_classRoomsSets_items)
          - [3.1.2.5.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > id`](#specifications_items_planningData_classRoomsSets_items_id)
          - [3.1.2.5.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > rooms`](#specifications_items_planningData_classRoomsSets_items_rooms)
            - [3.1.2.5.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > rooms > ClassRoomRef](#specifications_items_planningData_classRoomsSets_items_rooms_items)
          - [3.1.2.5.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > anonymousRooms`](#specifications_items_planningData_classRoomsSets_items_anonymousRooms)
      - [3.1.2.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks`](#specifications_items_planningData_tasks)
        - [3.1.2.6.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task](#specifications_items_planningData_tasks_items)
          - [3.1.2.6.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > id`](#specifications_items_planningData_tasks_items_id)
          - [3.1.2.6.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate`](#specifications_items_planningData_tasks_items_frameTemplate)
            - [3.1.2.6.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference](#specifications_items_planningData_tasks_items_frameTemplate_items)
              - [3.1.2.6.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > day`](#specifications_items_planningData_tasks_items_frameTemplate_items_day)
              - [3.1.2.6.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > index`](#specifications_items_planningData_tasks_items_frameTemplate_items_index)
              - [3.1.2.6.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > frame`](#specifications_items_planningData_tasks_items_frameTemplate_items_frame)
              - [3.1.2.6.1.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > type`](#specifications_items_planningData_tasks_items_frameTemplate_items_type)
          - [3.1.2.6.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > fullName`](#specifications_items_planningData_tasks_items_fullName)
          - [3.1.2.6.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > exKey`](#specifications_items_planningData_tasks_items_exKey)
          - [3.1.2.6.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > refColourInResult`](#specifications_items_planningData_tasks_items_refColourInResult)
      - [3.1.2.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers`](#specifications_items_planningData_teachers)
        - [3.1.2.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher](#specifications_items_planningData_teachers_items)
          - [3.1.2.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > id`](#specifications_items_planningData_teachers_items_id)
          - [3.1.2.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > shortName`](#specifications_items_planningData_teachers_items_shortName)
          - [3.1.2.7.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > fullName`](#specifications_items_planningData_teachers_items_fullName)
          - [3.1.2.7.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > exKey`](#specifications_items_planningData_teachers_items_exKey)
          - [3.1.2.7.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > associationIdentifier`](#specifications_items_planningData_teachers_items_associationIdentifier)
          - [3.1.2.7.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > overlappedAssessment`](#specifications_items_planningData_teachers_items_overlappedAssessment)
          - [3.1.2.7.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > frameTemplate`](#specifications_items_planningData_teachers_items_frameTemplate)
          - [3.1.2.7.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings`](#specifications_items_planningData_teachers_items_generalSettings)
            - [3.1.2.7.1.8.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay`](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay)
              - [3.1.2.7.1.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay > strict`](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay_strict)
              - [3.1.2.7.1.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay > preferable`](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay_preferable)
              - [3.1.2.7.1.8.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay > countAroundMidday`](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay_countAroundMidday)
            - [3.1.2.7.1.8.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay`](#specifications_items_planningData_teachers_items_generalSettings_dailyStay)
              - [3.1.2.7.1.8.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay > strict`](#specifications_items_planningData_teachers_items_generalSettings_dailyStay_strict)
              - [3.1.2.7.1.8.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay > preferable`](#specifications_items_planningData_teachers_items_generalSettings_dailyStay_preferable)
              - [3.1.2.7.1.8.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay > countAroundMidday`](#specifications_items_planningData_teachers_items_generalSettings_dailyStay_countAroundMidday)
            - [3.1.2.7.1.8.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > avoidGapsBetweenSesions`](#specifications_items_planningData_teachers_items_generalSettings_avoidGapsBetweenSesions)
            - [3.1.2.7.1.8.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching`](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching)
              - [3.1.2.7.1.8.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > type`](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type)
              - [3.1.2.7.1.8.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minutes`](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_minutes)
              - [3.1.2.7.1.8.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minBreak`](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_minBreak)
            - [3.1.2.7.1.8.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > avoidClassesAroundBreak`](#specifications_items_planningData_teachers_items_generalSettings_avoidClassesAroundBreak)
            - [3.1.2.7.1.8.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes)
              - [3.1.2.7.1.8.6.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay)
                - [3.1.2.7.1.8.6.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > strictDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay_strictDays)
                - [3.1.2.7.1.8.6.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > preferredDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay_preferredDays)
              - [3.1.2.7.1.8.6.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes)
                - [3.1.2.7.1.8.6.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > strictDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_strictDays)
                - [3.1.2.7.1.8.6.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > preferredDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays)
                - [3.1.2.7.1.8.6.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > minutes`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_minutes)
              - [3.1.2.7.1.8.6.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes)
                - [3.1.2.7.1.8.6.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > strictDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_strictDays)
                - [3.1.2.7.1.8.6.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > preferredDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays)
                - [3.1.2.7.1.8.6.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > minutes`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_minutes)
              - [3.1.2.7.1.8.6.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime)
                - [3.1.2.7.1.8.6.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > strictDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays)
                - [3.1.2.7.1.8.6.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > preferredDays`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays)
                - [3.1.2.7.1.8.6.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > minutes`](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes)
            - [3.1.2.7.1.8.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes)
              - [3.1.2.7.1.8.7.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings)
                - [3.1.2.7.1.8.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > strict`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings_strict)
                - [3.1.2.7.1.8.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > preferable`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings_preferable)
              - [3.1.2.7.1.8.7.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons)
                - [3.1.2.7.1.8.7.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > strict`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons_strict)
                - [3.1.2.7.1.8.7.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > preferable`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons_preferable)
              - [3.1.2.7.1.8.7.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly)
                - [3.1.2.7.1.8.7.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > strict`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly_strict)
                - [3.1.2.7.1.8.7.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > preferable`](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly_preferable)
            - [3.1.2.7.1.8.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities)
              - [3.1.2.7.1.8.8.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent)
                - [3.1.2.7.1.8.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
                - [3.1.2.7.1.8.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
              - [3.1.2.7.1.8.8.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenEndWeekAndStartWeekDays`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays)
                - [3.1.2.7.1.8.8.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
                - [3.1.2.7.1.8.8.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
              - [3.1.2.7.1.8.8.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeFirstOrLastHoursDay`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay)
                - [3.1.2.7.1.8.8.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
                - [3.1.2.7.1.8.8.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
              - [3.1.2.7.1.8.8.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection)
              - [3.1.2.7.1.8.8.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection)
              - [3.1.2.7.1.8.8.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection)
              - [3.1.2.7.1.8.8.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment)
              - [3.1.2.7.1.8.8.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment)
              - [3.1.2.7.1.8.8.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeAroundMidday`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday)
                - [3.1.2.7.1.8.8.9.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
                - [3.1.2.7.1.8.8.9.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
            - [3.1.2.7.1.8.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation)
              - [3.1.2.7.1.8.9.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > allowFreeDays`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_allowFreeDays)
              - [3.1.2.7.1.8.9.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching)
                - [3.1.2.7.1.8.9.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
                - [3.1.2.7.1.8.9.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
                - [3.1.2.7.1.8.9.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
                - [3.1.2.7.1.8.9.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
              - [3.1.2.7.1.8.9.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumTeaching`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_maximumTeaching)
                - [3.1.2.7.1.8.9.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
                - [3.1.2.7.1.8.9.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
                - [3.1.2.7.1.8.9.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
                - [3.1.2.7.1.8.9.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
              - [3.1.2.7.1.8.9.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumOccupancy`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumOccupancy)
                - [3.1.2.7.1.8.9.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
                - [3.1.2.7.1.8.9.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
                - [3.1.2.7.1.8.9.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
                - [3.1.2.7.1.8.9.4.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
              - [3.1.2.7.1.8.9.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumOccupancy`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_maximumOccupancy)
                - [3.1.2.7.1.8.9.5.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
                - [3.1.2.7.1.8.9.5.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
                - [3.1.2.7.1.8.9.5.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
                - [3.1.2.7.1.8.9.5.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
            - [3.1.2.7.1.8.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > middayReference`](#specifications_items_planningData_teachers_items_generalSettings_middayReference)
              - [3.1.2.7.1.8.10.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > middayReference > refFrame`](#specifications_items_planningData_teachers_items_generalSettings_middayReference_refFrame)
              - [3.1.2.7.1.8.10.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > middayReference > strict`](#specifications_items_planningData_teachers_items_generalSettings_middayReference_strict)
            - [3.1.2.7.1.8.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers`](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers)
              - [3.1.2.7.1.8.11.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > strict`](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers_strict)
              - [3.1.2.7.1.8.11.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > preferable`](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers_preferable)
          - [3.1.2.7.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings`](#specifications_items_planningData_teachers_items_periodSettings)
            - [3.1.2.7.1.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting](#specifications_items_planningData_teachers_items_periodSettings_items)
              - [3.1.2.7.1.9.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > refPeriod`](#specifications_items_planningData_teachers_items_periodSettings_items_refPeriod)
              - [3.1.2.7.1.9.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > weeklyStay`](#specifications_items_planningData_teachers_items_periodSettings_items_weeklyStay)
              - [3.1.2.7.1.9.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyStay`](#specifications_items_planningData_teachers_items_periodSettings_items_dailyStay)
              - [3.1.2.7.1.9.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidGapsBetweenSesions`](#specifications_items_planningData_teachers_items_periodSettings_items_avoidGapsBetweenSesions)
              - [3.1.2.7.1.9.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > maxContinuousTeaching`](#specifications_items_planningData_teachers_items_periodSettings_items_maxContinuousTeaching)
              - [3.1.2.7.1.9.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidClassesAroundBreak`](#specifications_items_planningData_teachers_items_periodSettings_items_avoidClassesAroundBreak)
              - [3.1.2.7.1.9.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > freeTimes`](#specifications_items_planningData_teachers_items_periodSettings_items_freeTimes)
              - [3.1.2.7.1.9.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > freePartTimes`](#specifications_items_planningData_teachers_items_periodSettings_items_freePartTimes)
              - [3.1.2.7.1.9.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > incompatibilities`](#specifications_items_planningData_teachers_items_periodSettings_items_incompatibilities)
              - [3.1.2.7.1.9.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyOcupation`](#specifications_items_planningData_teachers_items_periodSettings_items_dailyOcupation)
              - [3.1.2.7.1.9.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > middayReference`](#specifications_items_planningData_teachers_items_periodSettings_items_middayReference)
              - [3.1.2.7.1.9.1.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyBuildingTransfers`](#specifications_items_planningData_teachers_items_periodSettings_items_dailyBuildingTransfers)
      - [3.1.2.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects`](#specifications_items_planningData_subjects)
        - [3.1.2.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject](#specifications_items_planningData_subjects_items)
          - [3.1.2.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > id`](#specifications_items_planningData_subjects_items_id)
          - [3.1.2.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > shortName`](#specifications_items_planningData_subjects_items_shortName)
          - [3.1.2.8.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > fullName`](#specifications_items_planningData_subjects_items_fullName)
          - [3.1.2.8.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > exKey`](#specifications_items_planningData_subjects_items_exKey)
          - [3.1.2.8.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > isStudentMentoring`](#specifications_items_planningData_subjects_items_isStudentMentoring)
          - [3.1.2.8.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > technicalTeacher`](#specifications_items_planningData_subjects_items_technicalTeacher)
          - [3.1.2.8.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > type`](#specifications_items_planningData_subjects_items_type)
          - [3.1.2.8.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refClassroom`](#specifications_items_planningData_subjects_items_refClassroom)
          - [3.1.2.8.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refClassRoomSetsList`](#specifications_items_planningData_subjects_items_refClassRoomSetsList)
            - [3.1.2.8.1.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refClassRoomSetsList > ClassRoomSetRef](#specifications_items_planningData_subjects_items_refClassRoomSetsList_items)
          - [3.1.2.8.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refColourInResult`](#specifications_items_planningData_subjects_items_refColourInResult)
          - [3.1.2.8.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > frameTemplate`](#specifications_items_planningData_subjects_items_frameTemplate)
      - [3.1.2.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups`](#specifications_items_planningData_groups)
        - [3.1.2.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group](#specifications_items_planningData_groups_items)
          - [3.1.2.9.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > id`](#specifications_items_planningData_groups_items_id)
          - [3.1.2.9.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > shortName`](#specifications_items_planningData_groups_items_shortName)
          - [3.1.2.9.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > fullName`](#specifications_items_planningData_groups_items_fullName)
          - [3.1.2.9.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > exKey`](#specifications_items_planningData_groups_items_exKey)
          - [3.1.2.9.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refFrame`](#specifications_items_planningData_groups_items_refFrame)
          - [3.1.2.9.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > frameTemplate`](#specifications_items_planningData_groups_items_frameTemplate)
          - [3.1.2.9.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > numStudents`](#specifications_items_planningData_groups_items_numStudents)
          - [3.1.2.9.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > freeAfternoons`](#specifications_items_planningData_groups_items_freeAfternoons)
          - [3.1.2.9.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > notGaps`](#specifications_items_planningData_groups_items_notGaps)
          - [3.1.2.9.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > gapsAlwaysInNonPreferred`](#specifications_items_planningData_groups_items_gapsAlwaysInNonPreferred)
          - [3.1.2.9.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refCourse`](#specifications_items_planningData_groups_items_refCourse)
          - [3.1.2.9.1.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > includedGroups`](#specifications_items_planningData_groups_items_includedGroups)
            - [3.1.2.9.1.12.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > includedGroups > refGroups](#specifications_items_planningData_groups_items_includedGroups_items)
          - [3.1.2.9.1.13. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refTeacher`](#specifications_items_planningData_groups_items_refTeacher)
          - [3.1.2.9.1.14. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refClassroom`](#specifications_items_planningData_groups_items_refClassroom)
          - [3.1.2.9.1.15. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refClassRoomSetsList`](#specifications_items_planningData_groups_items_refClassRoomSetsList)
            - [3.1.2.9.1.15.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refClassRoomSetsList > ClassRoomSetRef](#specifications_items_planningData_groups_items_refClassRoomSetsList_items)
      - [3.1.2.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations`](#specifications_items_planningData_groupSetRelations)
        - [3.1.2.10.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation](#specifications_items_planningData_groupSetRelations_items)
          - [3.1.2.10.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > id`](#specifications_items_planningData_groupSetRelations_items_id)
          - [3.1.2.10.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > alias`](#specifications_items_planningData_groupSetRelations_items_alias)
          - [3.1.2.10.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression`](#specifications_items_planningData_groupSetRelations_items_expression)
            - [3.1.2.10.1.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > operator`](#specifications_items_planningData_groupSetRelations_items_expression_operator)
            - [3.1.2.10.1.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet`](#specifications_items_planningData_groupSetRelations_items_expression_refGroupSet)
              - [3.1.2.10.1.3.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet > GroupSetReference](#specifications_items_planningData_groupSetRelations_items_expression_refGroupSet_items)
            - [3.1.2.10.1.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions`](#specifications_items_planningData_groupSetRelations_items_expression_nestedRelationExpressions)
              - [3.1.2.10.1.3.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions > GroupSetRelationExpression](#specifications_items_planningData_groupSetRelations_items_expression_nestedRelationExpressions_items)
      - [3.1.2.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses`](#specifications_items_planningData_courses)
        - [3.1.2.11.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course](#specifications_items_planningData_courses_items)
          - [3.1.2.11.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > id`](#specifications_items_planningData_courses_items_id)
          - [3.1.2.11.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > fullName`](#specifications_items_planningData_courses_items_fullName)
          - [3.1.2.11.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > exKey`](#specifications_items_planningData_courses_items_exKey)
          - [3.1.2.11.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects`](#specifications_items_planningData_courses_items_courseSubjects)
            - [3.1.2.11.1.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects > CourseSubject](#specifications_items_planningData_courses_items_courseSubjects_items)
              - [3.1.2.11.1.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects > CourseSubject > numHours`](#specifications_items_planningData_courses_items_courseSubjects_items_numHours)
              - [3.1.2.11.1.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects > CourseSubject > refSubject`](#specifications_items_planningData_courses_items_courseSubjects_items_refSubject)
      - [3.1.2.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments`](#specifications_items_planningData_departments)
        - [3.1.2.12.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department](#specifications_items_planningData_departments_items)
          - [3.1.2.12.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > id`](#specifications_items_planningData_departments_items_id)
          - [3.1.2.12.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > fullName`](#specifications_items_planningData_departments_items_fullName)
          - [3.1.2.12.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > messageToDepartment`](#specifications_items_planningData_departments_items_messageToDepartment)
          - [3.1.2.12.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > isNew`](#specifications_items_planningData_departments_items_isNew)
          - [3.1.2.12.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > exKey`](#specifications_items_planningData_departments_items_exKey)
          - [3.1.2.12.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > email`](#specifications_items_planningData_departments_items_email)
          - [3.1.2.12.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refTeacher`](#specifications_items_planningData_departments_items_refTeacher)
            - [3.1.2.12.1.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refTeacher > refTeacher items](#specifications_items_planningData_departments_items_refTeacher_items)
          - [3.1.2.12.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refSubjects`](#specifications_items_planningData_departments_items_refSubjects)
            - [3.1.2.12.1.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refSubjects > refSubjects items](#specifications_items_planningData_departments_items_refSubjects_items)
      - [3.1.2.13. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions`](#specifications_items_planningData_sessions)
        - [3.1.2.13.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session](#specifications_items_planningData_sessions_items)
          - [3.1.2.13.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > id`](#specifications_items_planningData_sessions_items_id)
          - [3.1.2.13.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refFrame`](#specifications_items_planningData_sessions_items_refFrame)
          - [3.1.2.13.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainTask`](#specifications_items_planningData_sessions_items_refMainTask)
          - [3.1.2.13.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainTeacher`](#specifications_items_planningData_sessions_items_refMainTeacher)
          - [3.1.2.13.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainSubject`](#specifications_items_planningData_sessions_items_refMainSubject)
          - [3.1.2.13.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainGroup`](#specifications_items_planningData_sessions_items_refMainGroup)
            - [3.1.2.13.1.6.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainGroup > refIdGroup`](#specifications_items_planningData_sessions_items_refMainGroup_refIdGroup)
            - [3.1.2.13.1.6.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainGroup > numStudents`](#specifications_items_planningData_sessions_items_refMainGroup_numStudents)
          - [3.1.2.13.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refColourInResult`](#specifications_items_planningData_sessions_items_refColourInResult)
          - [3.1.2.13.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms`](#specifications_items_planningData_sessions_items_otherElementsInClassRooms)
            - [3.1.2.13.1.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items)
              - [3.1.2.13.1.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refSubject`](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refSubject)
              - [3.1.2.13.1.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTeacher`](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refTeacher)
              - [3.1.2.13.1.8.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refGroup`](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refGroup)
              - [3.1.2.13.1.8.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTask`](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refTask)
          - [3.1.2.13.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution`](#specifications_items_planningData_sessions_items_distribution)
            - [3.1.2.13.1.9.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > periods`](#specifications_items_planningData_sessions_items_distribution_periods)
              - [3.1.2.13.1.9.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > periods > RefPeriod](#specifications_items_planningData_sessions_items_distribution_periods_items)
            - [3.1.2.13.1.9.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods`](#specifications_items_planningData_sessions_items_distribution_stablePeriods)
              - [3.1.2.13.1.9.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTiming`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming)
                - [3.1.2.13.1.9.2.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTiming > DailyMinutes](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming_items)
              - [3.1.2.13.1.9.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming)
                - [3.1.2.13.1.9.2.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minutesAmount`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_minutesAmount)
                - [3.1.2.13.1.9.2.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > maxMinutesDaily`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily)
                - [3.1.2.13.1.9.2.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minMinutesDaily`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily)
                - [3.1.2.13.1.9.2.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMaxDuration`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration)
                - [3.1.2.13.1.9.2.2.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMinDuration`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration)
                - [3.1.2.13.1.9.2.2.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > allowDiscontinuity`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity)
              - [3.1.2.13.1.9.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTimingList`](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTimingList)
                - [3.1.2.13.1.9.2.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTimingList > StableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTimingList_items)
            - [3.1.2.13.1.9.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods`](#specifications_items_planningData_sessions_items_distribution_variablePeriods)
              - [3.1.2.13.1.9.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > timing`](#specifications_items_planningData_sessions_items_distribution_variablePeriods_timing)
                - [3.1.2.13.1.9.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > timing > stableTiming`](#specifications_items_planningData_sessions_items_distribution_variablePeriods_timing_stableTiming)
                - [3.1.2.13.1.9.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > timing > variableTiming`](#specifications_items_planningData_sessions_items_distribution_variablePeriods_timing_variableTiming)
              - [3.1.2.13.1.9.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > maximunTimeInPeriod`](#specifications_items_planningData_sessions_items_distribution_variablePeriods_maximunTimeInPeriod)
              - [3.1.2.13.1.9.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > minimnunTimeInPeriod`](#specifications_items_planningData_sessions_items_distribution_variablePeriods_minimnunTimeInPeriod)
              - [3.1.2.13.1.9.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > maximumTimeframe`](#specifications_items_planningData_sessions_items_distribution_variablePeriods_maximumTimeframe)
          - [3.1.2.13.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms`](#specifications_items_planningData_sessions_items_sessionClassRooms)
            - [3.1.2.13.1.10.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign`](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign)
              - [3.1.2.13.1.10.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items)
                - [3.1.2.13.1.10.1.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoom`](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom)
                - [3.1.2.13.1.10.1.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList`](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList)
                  - [3.1.2.13.1.10.1.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList > ClassRoomSetRef](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items)
            - [3.1.2.13.1.10.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > capacityPreference`](#specifications_items_planningData_sessions_items_sessionClassRooms_capacityPreference)
            - [3.1.2.13.1.10.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > capacityType`](#specifications_items_planningData_sessions_items_sessionClassRooms_capacityType)
            - [3.1.2.13.1.10.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > alwaysSameClassRoom`](#specifications_items_planningData_sessions_items_sessionClassRooms_alwaysSameClassRoom)
          - [3.1.2.13.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate`](#specifications_items_planningData_sessions_items_frameTemplate)
            - [3.1.2.13.1.11.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference](#specifications_items_planningData_sessions_items_frameTemplate_items)
              - [3.1.2.13.1.11.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > day`](#specifications_items_planningData_sessions_items_frameTemplate_items_day)
              - [3.1.2.13.1.11.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > index`](#specifications_items_planningData_sessions_items_frameTemplate_items_index)
              - [3.1.2.13.1.11.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > frame`](#specifications_items_planningData_sessions_items_frameTemplate_items_frame)
              - [3.1.2.13.1.11.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > type`](#specifications_items_planningData_sessions_items_frameTemplate_items_type)
          - [3.1.2.13.1.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings`](#specifications_items_planningData_sessions_items_sessionSettings)
            - [3.1.2.13.1.12.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidFirstHourSessions`](#specifications_items_planningData_sessions_items_sessionSettings_avoidFirstHourSessions)
            - [3.1.2.13.1.12.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidLastHourSessions`](#specifications_items_planningData_sessions_items_sessionSettings_avoidLastHourSessions)
            - [3.1.2.13.1.12.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidAssingLastHourAndFirstNextDay`](#specifications_items_planningData_sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay)
            - [3.1.2.13.1.12.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > sameHourPreference`](#specifications_items_planningData_sessions_items_sessionSettings_sameHourPreference)
            - [3.1.2.13.1.12.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidAfternoonSessions`](#specifications_items_planningData_sessions_items_sessionSettings_avoidAfternoonSessions)
            - [3.1.2.13.1.12.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidAfterBreakSessions`](#specifications_items_planningData_sessions_items_sessionSettings_avoidAfterBreakSessions)
            - [3.1.2.13.1.12.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfConsecutiveSession`](#specifications_items_planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession)
            - [3.1.2.13.1.12.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfSession`](#specifications_items_planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfSession)
            - [3.1.2.13.1.12.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > followedDaysPreference`](#specifications_items_planningData_sessions_items_sessionSettings_followedDaysPreference)
            - [3.1.2.13.1.12.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > consecutiveWeeksBorders`](#specifications_items_planningData_sessions_items_sessionSettings_consecutiveWeeksBorders)
            - [3.1.2.13.1.12.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > samePositionEveryPeriod`](#specifications_items_planningData_sessions_items_sessionSettings_samePositionEveryPeriod)
          - [3.1.2.13.1.13. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations`](#specifications_items_planningData_sessions_items_sessionRelations)
            - [3.1.2.13.1.13.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > refSimultaneusGroup`](#specifications_items_planningData_sessions_items_sessionRelations_refSimultaneusGroup)
            - [3.1.2.13.1.13.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays`](#specifications_items_planningData_sessions_items_sessionRelations_differentDays)
              - [3.1.2.13.1.13.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays > refSesions`](#specifications_items_planningData_sessions_items_sessionRelations_differentDays_refSesions)
                - [3.1.2.13.1.13.2.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays > refSesions > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_differentDays_refSesions_items)
              - [3.1.2.13.1.13.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays > daysSetting`](#specifications_items_planningData_sessions_items_sessionRelations_differentDays_daysSetting)
            - [3.1.2.13.1.13.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup`](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup)
              - [3.1.2.13.1.13.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > id`](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_id)
              - [3.1.2.13.1.13.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions`](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions)
                - [3.1.2.13.1.13.3.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions_items)
              - [3.1.2.13.1.13.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > order`](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_order)
              - [3.1.2.13.1.13.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > allowBreakBetweenSessions`](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions)
            - [3.1.2.13.1.13.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions`](#specifications_items_planningData_sessions_items_sessionRelations_nonConsecutiveSessions)
              - [3.1.2.13.1.13.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_nonConsecutiveSessions_items)
            - [3.1.2.13.1.13.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonSimultaneus`](#specifications_items_planningData_sessions_items_sessionRelations_nonSimultaneus)
              - [3.1.2.13.1.13.5.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonSimultaneus > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_nonSimultaneus_items)
            - [3.1.2.13.1.13.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > previousTo`](#specifications_items_planningData_sessions_items_sessionRelations_previousTo)
              - [3.1.2.13.1.13.6.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > previousTo > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_previousTo_items)
            - [3.1.2.13.1.13.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > afterTo`](#specifications_items_planningData_sessions_items_sessionRelations_afterTo)
              - [3.1.2.13.1.13.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > afterTo > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_afterTo_items)
            - [3.1.2.13.1.13.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo`](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo)
              - [3.1.2.13.1.13.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items)
                - [3.1.2.13.1.13.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions`](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions)
                  - [3.1.2.13.1.13.8.1.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items)
                - [3.1.2.13.1.13.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > days`](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_days)
            - [3.1.2.13.1.13.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo`](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo)
              - [3.1.2.13.1.13.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items)
                - [3.1.2.13.1.13.9.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions`](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions)
                  - [3.1.2.13.1.13.9.1.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions > SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items)
                - [3.1.2.13.1.13.9.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > days`](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_days)
          - [3.1.2.13.1.14. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > department`](#specifications_items_planningData_sessions_items_department)
      - [3.1.2.14. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings`](#specifications_items_planningData_meetings)
        - [3.1.2.14.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting](#specifications_items_planningData_meetings_items)
          - [3.1.2.14.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > id`](#specifications_items_planningData_meetings_items_id)
          - [3.1.2.14.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refFrame`](#specifications_items_planningData_meetings_items_refFrame)
          - [3.1.2.14.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refTask`](#specifications_items_planningData_meetings_items_refTask)
          - [3.1.2.14.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refTeachers`](#specifications_items_planningData_meetings_items_refTeachers)
            - [3.1.2.14.1.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refTeachers > RefTeacher](#specifications_items_planningData_meetings_items_refTeachers_items)
          - [3.1.2.14.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refColourInResult`](#specifications_items_planningData_meetings_items_refColourInResult)
          - [3.1.2.14.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > distribution`](#specifications_items_planningData_meetings_items_distribution)
          - [3.1.2.14.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > frameTemplate`](#specifications_items_planningData_meetings_items_frameTemplate)
          - [3.1.2.14.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refClassRoomToAssign`](#specifications_items_planningData_meetings_items_refClassRoomToAssign)
          - [3.1.2.14.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refBuilding`](#specifications_items_planningData_meetings_items_refBuilding)
          - [3.1.2.14.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > settings`](#specifications_items_planningData_meetings_items_settings)
            - [3.1.2.14.1.10.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > settings > computeForMaxMinOccupancy`](#specifications_items_planningData_meetings_items_settings_computeForMaxMinOccupancy)
            - [3.1.2.14.1.10.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > settings > samePositionEveryPeriod`](#specifications_items_planningData_meetings_items_settings_samePositionEveryPeriod)
      - [3.1.2.15. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities`](#specifications_items_planningData_complementaryActivities)
        - [3.1.2.15.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary](#specifications_items_planningData_complementaryActivities_items)
          - [3.1.2.15.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > id`](#specifications_items_planningData_complementaryActivities_items_id)
          - [3.1.2.15.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refFrame`](#specifications_items_planningData_complementaryActivities_items_refFrame)
          - [3.1.2.15.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refTask`](#specifications_items_planningData_complementaryActivities_items_refTask)
          - [3.1.2.15.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refTeacher`](#specifications_items_planningData_complementaryActivities_items_refTeacher)
          - [3.1.2.15.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refColourInResult`](#specifications_items_planningData_complementaryActivities_items_refColourInResult)
          - [3.1.2.15.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > distribution`](#specifications_items_planningData_complementaryActivities_items_distribution)
          - [3.1.2.15.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > frameTemplate`](#specifications_items_planningData_complementaryActivities_items_frameTemplate)
          - [3.1.2.15.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refClassRoomToAssign`](#specifications_items_planningData_complementaryActivities_items_refClassRoomToAssign)
          - [3.1.2.15.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refBuilding`](#specifications_items_planningData_complementaryActivities_items_refBuilding)
          - [3.1.2.15.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > settings`](#specifications_items_planningData_complementaryActivities_items_settings)
      - [3.1.2.16. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices`](#specifications_items_planningData_onCallServices)
        - [3.1.2.16.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService](#specifications_items_planningData_onCallServices_items)
          - [3.1.2.16.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > id`](#specifications_items_planningData_onCallServices_items_id)
          - [3.1.2.16.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refFrame`](#specifications_items_planningData_onCallServices_items_refFrame)
          - [3.1.2.16.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refPeriods`](#specifications_items_planningData_onCallServices_items_refPeriods)
            - [3.1.2.16.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refPeriods > RefPeriod](#specifications_items_planningData_onCallServices_items_refPeriods_items)
          - [3.1.2.16.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTask`](#specifications_items_planningData_onCallServices_items_refTask)
          - [3.1.2.16.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > inBreak`](#specifications_items_planningData_onCallServices_items_inBreak)
          - [3.1.2.16.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection`](#specifications_items_planningData_onCallServices_items_teachersEachSection)
            - [3.1.2.16.1.6.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > byDefault`](#specifications_items_planningData_onCallServices_items_teachersEachSection_byDefault)
            - [3.1.2.16.1.6.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection`](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection)
              - [3.1.2.16.1.6.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items)
                - [3.1.2.16.1.6.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > day`](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_day)
                - [3.1.2.16.1.6.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > index`](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_index)
                - [3.1.2.16.1.6.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > numTeachers`](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_numTeachers)
          - [3.1.2.16.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers`](#specifications_items_planningData_onCallServices_items_refTeachers)
            - [3.1.2.16.1.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher](#specifications_items_planningData_onCallServices_items_refTeachers_items)
              - [3.1.2.16.1.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherId`](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherId)
              - [3.1.2.16.1.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > numOfSections`](#specifications_items_planningData_onCallServices_items_refTeachers_items_numOfSections)
              - [3.1.2.16.1.7.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate`](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate)
                - [3.1.2.16.1.7.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items)
                  - [3.1.2.16.1.7.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > day`](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day)
                  - [3.1.2.16.1.7.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > index`](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index)
                  - [3.1.2.16.1.7.1.3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > frame`](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame)
                  - [3.1.2.16.1.7.1.3.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > type`](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type)
          - [3.1.2.16.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refColourInResult`](#specifications_items_planningData_onCallServices_items_refColourInResult)
          - [3.1.2.16.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > frameTemplate`](#specifications_items_planningData_onCallServices_items_frameTemplate)
          - [3.1.2.16.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refBuilding`](#specifications_items_planningData_onCallServices_items_refBuilding)
          - [3.1.2.16.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > settings`](#specifications_items_planningData_onCallServices_items_settings)
      - [3.1.2.17. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights`](#specifications_items_planningData_optimizationWeights)
        - [3.1.2.17.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > timetableGaps`](#specifications_items_planningData_optimizationWeights_timetableGaps)
          - [3.1.2.17.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > timetableGaps > groupGaps`](#specifications_items_planningData_optimizationWeights_timetableGaps_groupGaps)
          - [3.1.2.17.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > timetableGaps > teacherGaps`](#specifications_items_planningData_optimizationWeights_timetableGaps_teacherGaps)
        - [3.1.2.17.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions`](#specifications_items_planningData_optimizationWeights_nonPreferredPositions)
          - [3.1.2.17.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inGroups`](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inGroups)
          - [3.1.2.17.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inTeachers`](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inTeachers)
          - [3.1.2.17.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inSubjectsAndTask`](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inSubjectsAndTask)
          - [3.1.2.17.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inSessions`](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inSessions)
        - [3.1.2.17.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions`](#specifications_items_planningData_optimizationWeights_sessions)
          - [3.1.2.17.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > nonPreferredClassRoom`](#specifications_items_planningData_optimizationWeights_sessions_nonPreferredClassRoom)
          - [3.1.2.17.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > samePositionEveryPeriod`](#specifications_items_planningData_optimizationWeights_sessions_samePositionEveryPeriod)
          - [3.1.2.17.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > consecutiveDays`](#specifications_items_planningData_optimizationWeights_sessions_consecutiveDays)
          - [3.1.2.17.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > bordersTimetable`](#specifications_items_planningData_optimizationWeights_sessions_bordersTimetable)
          - [3.1.2.17.3.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > afternoonOrAfterBreakClasses`](#specifications_items_planningData_optimizationWeights_sessions_afternoonOrAfterBreakClasses)
          - [3.1.2.17.3.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > sameHourSessionClasses`](#specifications_items_planningData_optimizationWeights_sessions_sameHourSessionClasses)
          - [3.1.2.17.3.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > classRoomsChanges`](#specifications_items_planningData_optimizationWeights_sessions_classRoomsChanges)
        - [3.1.2.17.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers`](#specifications_items_planningData_optimizationWeights_teachers)
          - [3.1.2.17.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > teacherIncompatibities`](#specifications_items_planningData_optimizationWeights_teachers_teacherIncompatibities)
          - [3.1.2.17.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > uniformDailyDistribution`](#specifications_items_planningData_optimizationWeights_teachers_uniformDailyDistribution)
          - [3.1.2.17.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > excessContinuousTeaching`](#specifications_items_planningData_optimizationWeights_teachers_excessContinuousTeaching)
          - [3.1.2.17.4.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > excessPermanence`](#specifications_items_planningData_optimizationWeights_teachers_excessPermanence)
          - [3.1.2.17.4.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > continuousSessionsWithGroup`](#specifications_items_planningData_optimizationWeights_teachers_continuousSessionsWithGroup)
          - [3.1.2.17.4.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > onCallSectionsOnBorders`](#specifications_items_planningData_optimizationWeights_teachers_onCallSectionsOnBorders)
          - [3.1.2.17.4.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > teacherOrder`](#specifications_items_planningData_optimizationWeights_teachers_teacherOrder)
      - [3.1.2.18. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > engineSettings`](#specifications_items_planningData_engineSettings)
        - [3.1.2.18.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > engineSettings > teacherBalance`](#specifications_items_planningData_engineSettings_teacherBalance)
        - [3.1.2.18.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > engineSettings > countGapsAroundMidday`](#specifications_items_planningData_engineSettings_countGapsAroundMidday)
    - [3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results`](#specifications_items_results)
      - [3.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineResult](#specifications_items_results_items)
        - [3.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > date`](#specifications_items_results_items_date)
        - [3.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > weight`](#specifications_items_results_items_weight)
        - [3.1.3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable`](#specifications_items_results_items_timetable)
          - [3.1.3.1.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms`](#specifications_items_results_items_timetable_anonymousClassRooms)
            - [3.1.3.1.3.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom](#specifications_items_results_items_timetable_anonymousClassRooms_items)
              - [3.1.3.1.3.1.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > refClassRoomsSet`](#specifications_items_results_items_timetable_anonymousClassRooms_items_refClassRoomsSet)
              - [3.1.3.1.3.1.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated`](#specifications_items_results_items_timetable_anonymousClassRooms_items_classRoomsCreated)
                - [3.1.3.1.3.1.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated > AnonymousRoom](#specifications_items_results_items_timetable_anonymousClassRooms_items_classRoomsCreated_items)
          - [3.1.3.1.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections`](#specifications_items_results_items_timetable_assignedSections)
            - [3.1.3.1.3.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection](#specifications_items_results_items_timetable_assignedSections_items)
              - [3.1.3.1.3.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > refFrame`](#specifications_items_results_items_timetable_assignedSections_items_refFrame)
              - [3.1.3.1.3.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > day`](#specifications_items_results_items_timetable_assignedSections_items_day)
              - [3.1.3.1.3.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > realIndex`](#specifications_items_results_items_timetable_assignedSections_items_realIndex)
              - [3.1.3.1.3.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > fictionalIndex`](#specifications_items_results_items_timetable_assignedSections_items_fictionalIndex)
              - [3.1.3.1.3.2.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > startTime`](#specifications_items_results_items_timetable_assignedSections_items_startTime)
              - [3.1.3.1.3.2.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > endTime`](#specifications_items_results_items_timetable_assignedSections_items_endTime)
              - [3.1.3.1.3.2.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment`](#specifications_items_results_items_timetable_assignedSections_items_assignment)
                - [3.1.3.1.3.2.1.7.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions`](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions)
                  - [3.1.3.1.3.2.1.7.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items)
                    - [3.1.3.1.3.2.1.7.1.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refSession`](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refSession)
                    - [3.1.3.1.3.2.1.7.1.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms`](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms)
                      - [3.1.3.1.3.2.1.7.1.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms > RefclassRomm](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items)
                    - [3.1.3.1.3.2.1.7.1.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers`](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers)
                      - [3.1.3.1.3.2.1.7.1.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers > RefTeacher](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items)
                - [3.1.3.1.3.2.1.7.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings`](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings)
                  - [3.1.3.1.3.2.1.7.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items)
                    - [3.1.3.1.3.2.1.7.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refMeeting`](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items_refMeeting)
                    - [3.1.3.1.3.2.1.7.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refClassRomms`](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items_refClassRomms)
                - [3.1.3.1.3.2.1.7.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities`](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities)
                  - [3.1.3.1.3.2.1.7.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items)
                    - [3.1.3.1.3.2.1.7.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refComplementary`](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary)
                    - [3.1.3.1.3.2.1.7.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refClassRomms`](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms)
                - [3.1.3.1.3.2.1.7.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices`](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices)
                  - [3.1.3.1.3.2.1.7.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items)
                    - [3.1.3.1.3.2.1.7.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refOnCall`](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items_refOnCall)
                    - [3.1.3.1.3.2.1.7.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refTeacher`](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items_refTeacher)

**Title:** GhcMultiplatformSchema

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Schema with the structure of the GHC Multiplatform files

| Property                             | Pattern | Type            | Deprecated | Definition | Title/Description |
| ------------------------------------ | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [id](#id )                         | No      | integer         | No         | -          | IdFile            |
| + [meta](#meta )                     | No      | object          | No         | -          | FileMetadata      |
| + [specifications](#specifications ) | No      | array of object | No         | -          | Specifications    |

## <a name="id"></a>1. Property `GhcMultiplatformSchema > id`

**Title:** IdFile

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the id number of the file at the Penalara Server.

## <a name="meta"></a>2. Property `GhcMultiplatformSchema > meta`

**Title:** FileMetadata

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Information about the file.

| Property                                      | Pattern | Type             | Deprecated | Definition | Title/Description  |
| --------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------ |
| + [name](#meta_name )                         | No      | string           | No         | -          | TimetableName      |
| + [versionJson](#meta_versionJson )           | No      | string           | No         | -          | SchemaVersion      |
| + [createdDate](#meta_createdDate )           | No      | string           | No         | -          | JsonCreatedDate    |
| + [lastModifiedDate](#meta_lastModifiedDate ) | No      | string           | No         | -          | JsonGenerationDate |
| + [refUser](#meta_refUser )                   | No      | string           | No         | -          | UserReference      |
| + [source](#meta_source )                     | No      | enum (of string) | No         | -          | SourceModule       |
| - [fullMode](#meta_fullMode )                 | No      | boolean          | No         | -          | FullPlannerMode    |

### <a name="meta_name"></a>2.1. Property `GhcMultiplatformSchema > meta > name`

**Title:** TimetableName

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Name of the Timetable

### <a name="meta_versionJson"></a>2.2. Property `GhcMultiplatformSchema > meta > versionJson`

**Title:** SchemaVersion

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Version of multiplatformGHCSchema used

### <a name="meta_createdDate"></a>2.3. Property `GhcMultiplatformSchema > meta > createdDate`

**Title:** JsonCreatedDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | Yes         |
| **Format**   | `date-time` |

**Description:** Json generation date.

### <a name="meta_lastModifiedDate"></a>2.4. Property `GhcMultiplatformSchema > meta > lastModifiedDate`

**Title:** JsonGenerationDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | Yes         |
| **Format**   | `date-time` |

**Description:** Json last modification date.

### <a name="meta_refUser"></a>2.5. Property `GhcMultiplatformSchema > meta > refUser`

**Title:** UserReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Contains a user reference who owns the file.

### <a name="meta_source"></a>2.6. Property `GhcMultiplatformSchema > meta > source`

**Title:** SourceModule

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Indicates the GHCMultiplatform module that generated the file.

Must be one of:
* "horarios"
* "je"
* "examenes"

### <a name="meta_fullMode"></a>2.7. Property `GhcMultiplatformSchema > meta > fullMode`

**Title:** FullPlannerMode

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if the planner must use the full mode.

## <a name="specifications"></a>3. Property `GhcMultiplatformSchema > specifications`

**Title:** Specifications

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of specification versions of the scheduling plan and the results associated with each one, if it has been resolved by the ghc engine.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be               | Description                                                                                                                     |
| --------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| [PlannerSpecification](#specifications_items) | GHC scheduling plan specification, which may or may not contain results depending on whether it was executed in the ghc engine. |

### <a name="specifications_items"></a>3.1. GhcMultiplatformSchema > specifications > PlannerSpecification

**Title:** PlannerSpecification

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** GHC scheduling plan specification, which may or may not contain results depending on whether it was executed in the ghc engine.

| Property                                              | Pattern | Type            | Deprecated | Definition                            | Title/Description        |
| ----------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------- | ------------------------ |
| + [modifiedDate](#specifications_items_modifiedDate ) | No      | string          | No         | -                                     | PlanningModificationDate |
| + [planningData](#specifications_items_planningData ) | No      | object          | No         | In ../common/planningData.schema.json | PlanningGhcData          |
| - [results](#specifications_items_results )           | No      | array of object | No         | -                                     | EngineResults            |

#### <a name="specifications_items_modifiedDate"></a>3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > modifiedDate`

**Title:** PlanningModificationDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | Yes         |
| **Format**   | `date-time` |

**Description:** Planning modification date

#### <a name="specifications_items_planningData"></a>3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData`

**Title:** PlanningGhcData

|                           |                                    |
| ------------------------- | ---------------------------------- |
| **Type**                  | `object`                           |
| **Required**              | Yes                                |
| **Additional properties** | Any type allowed                   |
| **Defined in**            | ../common/planningData.schema.json |

**Description:** Description of the elements that will be part of the schedule and their participation in the sessions that need to be assigned to resolve it.

| Property                                                                                 | Pattern | Type            | Deprecated | Definition | Title/Description       |
| ---------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------- |
| - [periods](#specifications_items_planningData_periods )                                 | No      | object          | No         | -          | Periods                 |
| - [frames](#specifications_items_planningData_frames )                                   | No      | array of object | No         | -          | Frames                  |
| - [buildings](#specifications_items_planningData_buildings )                             | No      | array of object | No         | -          | Buildings               |
| - [classRooms](#specifications_items_planningData_classRooms )                           | No      | array of object | No         | -          | ClassRooms              |
| - [classRoomsSets](#specifications_items_planningData_classRoomsSets )                   | No      | array of object | No         | -          | ClassRoomsSets          |
| - [tasks](#specifications_items_planningData_tasks )                                     | No      | array of object | No         | -          | Tasks                   |
| - [teachers](#specifications_items_planningData_teachers )                               | No      | array of object | No         | -          | Teachers                |
| - [subjects](#specifications_items_planningData_subjects )                               | No      | array of object | No         | -          | Subjects                |
| - [groups](#specifications_items_planningData_groups )                                   | No      | array of object | No         | -          | Groups                  |
| - [groupSetRelations](#specifications_items_planningData_groupSetRelations )             | No      | array           | No         | -          | GroupSetRelations       |
| - [courses](#specifications_items_planningData_courses )                                 | No      | array of object | No         | -          | Courses                 |
| - [departments](#specifications_items_planningData_departments )                         | No      | array of object | No         | -          | Departments             |
| - [sessions](#specifications_items_planningData_sessions )                               | No      | array of object | No         | -          | Sessions                |
| - [meetings](#specifications_items_planningData_meetings )                               | No      | array of object | No         | -          | Meetings                |
| - [complementaryActivities](#specifications_items_planningData_complementaryActivities ) | No      | array of object | No         | -          | ComplementaryActivities |
| - [onCallServices](#specifications_items_planningData_onCallServices )                   | No      | array of object | No         | -          | OnCallServices          |
| - [optimizationWeights](#specifications_items_planningData_optimizationWeights )         | No      | object          | No         | -          | OptimizationWeights     |
| - [engineSettings](#specifications_items_planningData_engineSettings )                   | No      | object          | No         | -          | EngineSettings          |

##### <a name="specifications_items_planningData_periods"></a>3.1.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods`

**Title:** Periods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Weeks or periods with different assignments which contains the timetable.

| Property                                                                         | Pattern | Type            | Deprecated | Definition | Title/Description |
| -------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [followedPeriods](#specifications_items_planningData_periods_followedPeriods ) | No      | boolean         | No         | -          | FollowedPeriods   |
| + [periodsList](#specifications_items_planningData_periods_periodsList )         | No      | array of object | No         | -          | PeriodsList       |
| - [periodSets](#specifications_items_planningData_periods_periodSets )           | No      | array of object | No         | -          | PeriodsSets       |

###### <a name="specifications_items_planningData_periods_followedPeriods"></a>3.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > followedPeriods`

**Title:** FollowedPeriods

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.

###### <a name="specifications_items_planningData_periods_periodsList"></a>3.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList`

**Title:** PeriodsList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of periods.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                        | Description |
| ---------------------------------------------------------------------- | ----------- |
| [Period](#specifications_items_planningData_periods_periodsList_items) | -           |

###### <a name="specifications_items_planningData_periods_periodsList_items"></a>3.1.2.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period

**Title:** Period

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                 | Pattern | Type            | Deprecated | Definition | Title/Description                                                                                                                                                                              |
| ---------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_periods_periodsList_items_id )                 | No      | string          | No         | -          | Period identifier.                                                                                                                                                                             |
| - [alias](#specifications_items_planningData_periods_periodsList_items_alias )           | No      | string          | No         | -          | Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to. |
| + [lastDay](#specifications_items_planningData_periods_periodsList_items_lastDay )       | No      | integer         | No         | -          | The end day of the period (included).                                                                                                                                                          |
| - [dayAliases](#specifications_items_planningData_periods_periodsList_items_dayAliases ) | No      | array of object | No         | -          | AliasDayList                                                                                                                                                                                   |

###### <a name="specifications_items_planningData_periods_periodsList_items_id"></a>3.1.2.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Period identifier.

###### <a name="specifications_items_planningData_periods_periodsList_items_alias"></a>3.1.2.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.

###### <a name="specifications_items_planningData_periods_periodsList_items_lastDay"></a>3.1.2.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > lastDay`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** The end day of the period (included).

###### <a name="specifications_items_planningData_periods_periodsList_items_dayAliases"></a>3.1.2.1.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases`

**Title:** AliasDayList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Alias for each day of the period. It is an optional definition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                      | Description |
| ---------------------------------------------------------------------------------------------------- | ----------- |
| [AliasDayDeifinition](#specifications_items_planningData_periods_periodsList_items_dayAliases_items) | -           |

###### <a name="specifications_items_planningData_periods_periodsList_items_dayAliases_items"></a>3.1.2.1.2.1.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition

**Title:** AliasDayDeifinition

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                        | Pattern | Type    | Deprecated | Definition | Title/Description                                                     |
| ----------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------- |
| + [dayId](#specifications_items_planningData_periods_periodsList_items_dayAliases_items_dayId ) | No      | integer | No         | -          | Identifier of the day of the week, it is unique across all weeks.     |
| + [alias](#specifications_items_planningData_periods_periodsList_items_dayAliases_items_alias ) | No      | string  | No         | -          | Header to identify the day in the results table and the frame column. |

###### <a name="specifications_items_planningData_periods_periodsList_items_dayAliases_items_dayId"></a>3.1.2.1.2.1.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > dayId`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Identifier of the day of the week, it is unique across all weeks.

###### <a name="specifications_items_planningData_periods_periodsList_items_dayAliases_items_alias"></a>3.1.2.1.2.1.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Header to identify the day in the results table and the frame column.

###### <a name="specifications_items_planningData_periods_periodSets"></a>3.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets`

**Title:** PeriodsSets

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of sets of periods, which are groupings of multiple periods to make it easier to assign periods to sessions in batches, and many of them overlap by sharing several weeks in common.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                           | Description |
| ------------------------------------------------------------------------- | ----------- |
| [PeriodsSet](#specifications_items_planningData_periods_periodSets_items) | -           |

###### <a name="specifications_items_planningData_periods_periodSets_items"></a>3.1.2.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet

**Title:** PeriodsSet

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                | Pattern | Type            | Deprecated | Definition | Title/Description                                        |
| --------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | -------------------------------------------------------- |
| + [id](#specifications_items_planningData_periods_periodSets_items_id )                 | No      | string          | No         | -          | Period identifier.                                       |
| + [periodList](#specifications_items_planningData_periods_periodSets_items_periodList ) | No      | array of string | No         | -          | List of identifiers of the weeks that belong to the set. |

###### <a name="specifications_items_planningData_periods_periodSets_items_id"></a>3.1.2.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Period identifier.

###### <a name="specifications_items_planningData_periods_periodSets_items_periodList"></a>3.1.2.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet > periodList`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** List of identifiers of the weeks that belong to the set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                  | Description |
| ------------------------------------------------------------------------------------------------ | ----------- |
| [periodList items](#specifications_items_planningData_periods_periodSets_items_periodList_items) | -           |

###### <a name="specifications_items_planningData_periods_periodSets_items_periodList_items"></a>3.1.2.1.3.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > periods > periodSets > PeriodsSet > periodList > periodList items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

##### <a name="specifications_items_planningData_frames"></a>3.1.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames`

**Title:** Frames

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Tables of the timetable that contain sections where the class units are located.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                          | Description |
| -------------------------------------------------------- | ----------- |
| [Frame](#specifications_items_planningData_frames_items) | -           |

###### <a name="specifications_items_planningData_frames_items"></a>3.1.2.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame

**Title:** Frame

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                          | Pattern | Type            | Deprecated | Definition | Title/Description          |
| ----------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | -------------------------- |
| + [id](#specifications_items_planningData_frames_items_id )       | No      | string          | No         | -          | Frame identifier.          |
| - [exKey](#specifications_items_planningData_frames_items_exKey ) | No      | string          | No         | -          | External key of the frame. |
| + [days](#specifications_items_planningData_frames_items_days )   | No      | array of object | No         | -          | Days                       |

###### <a name="specifications_items_planningData_frames_items_id"></a>3.1.2.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

###### <a name="specifications_items_planningData_frames_items_exKey"></a>3.1.2.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the frame.

###### <a name="specifications_items_planningData_frames_items_days"></a>3.1.2.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days`

**Title:** Days

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of the days in the frame

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                        | Description            |
| ---------------------------------------------------------------------- | ---------------------- |
| [FrameDay](#specifications_items_planningData_frames_items_days_items) | Day with its sections. |

###### <a name="specifications_items_planningData_frames_items_days_items"></a>3.1.2.2.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay

**Title:** FrameDay

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Day with its sections.

| Property                                                                           | Pattern | Type            | Deprecated | Definition | Title/Description |
| ---------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| + [day](#specifications_items_planningData_frames_items_days_items_day )           | No      | integer         | No         | -          | Day of the week.  |
| + [sections](#specifications_items_planningData_frames_items_days_items_sections ) | No      | array of object | No         | -          | Sections          |

###### <a name="specifications_items_planningData_frames_items_days_items_day"></a>3.1.2.2.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week.

###### <a name="specifications_items_planningData_frames_items_days_items_sections"></a>3.1.2.2.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections`

**Title:** Sections

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** Timetable cells where class units are located.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                      | Description |
| ------------------------------------------------------------------------------------ | ----------- |
| [Section](#specifications_items_planningData_frames_items_days_items_sections_items) | -           |

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items"></a>3.1.2.2.1.3.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section

**Title:** Section

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                            | Pattern | Type             | Deprecated | Definition | Title/Description                                                           |
| --------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------------------- |
| + [index](#specifications_items_planningData_frames_items_days_items_sections_items_index )         | No      | integer          | No         | -          | Index built into the day where the section is located.                      |
| + [entryTime](#specifications_items_planningData_frames_items_days_items_sections_items_entryTime ) | No      | string           | No         | -          | Start time of the section.                                                  |
| + [exitTime](#specifications_items_planningData_frames_items_days_items_sections_items_exitTime )   | No      | string           | No         | -          | End time of the section.                                                    |
| - [exKey](#specifications_items_planningData_frames_items_days_items_sections_items_exKey )         | No      | string           | No         | -          | External key of the section.                                                |
| + [duration](#specifications_items_planningData_frames_items_days_items_sections_items_duration )   | No      | integer          | No         | -          | It indicates the duration (real or proportional) of the section in minutes. |
| + [type](#specifications_items_planningData_frames_items_days_items_sections_items_type )           | No      | enum (of string) | No         | -          | SectionType                                                                 |
| - [allowed](#specifications_items_planningData_frames_items_days_items_sections_items_allowed )     | No      | boolean          | No         | -          | It indicates if the section is available to assign.                         |

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_index"></a>3.1.2.2.1.3.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_entryTime"></a>3.1.2.2.1.3.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > entryTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** Start time of the section.

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_exitTime"></a>3.1.2.2.1.3.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > exitTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** End time of the section.

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_exKey"></a>3.1.2.2.1.3.1.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the section.

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_duration"></a>3.1.2.2.1.3.1.2.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > duration`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** It indicates the duration (real or proportional) of the section in minutes.

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_type"></a>3.1.2.2.1.3.1.2.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > type`

**Title:** SectionType

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Kind of section.

Must be one of:
* "teaching"
* "break"
* "midday"

###### <a name="specifications_items_planningData_frames_items_days_items_sections_items_allowed"></a>3.1.2.2.1.3.1.2.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > frames > Frame > days > FrameDay > sections > Section > allowed`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates if the section is available to assign.

##### <a name="specifications_items_planningData_buildings"></a>3.1.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings`

**Title:** Buildings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains the school or educational institution buildings.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                | Description |
| -------------------------------------------------------------- | ----------- |
| [Building](#specifications_items_planningData_buildings_items) | -           |

###### <a name="specifications_items_planningData_buildings_items"></a>3.1.2.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building

**Title:** Building

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                     | Pattern | Type            | Deprecated | Definition | Title/Description    |
| ---------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | -------------------- |
| + [id](#specifications_items_planningData_buildings_items_id )               | No      | string          | No         | -          | Building identifier. |
| - [fullName](#specifications_items_planningData_buildings_items_fullName )   | No      | string          | No         | -          | Building full name.  |
| - [distances](#specifications_items_planningData_buildings_items_distances ) | No      | array of object | No         | -          | Distances            |

###### <a name="specifications_items_planningData_buildings_items_id"></a>3.1.2.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Building identifier.

###### <a name="specifications_items_planningData_buildings_items_fullName"></a>3.1.2.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building full name.

###### <a name="specifications_items_planningData_buildings_items_distances"></a>3.1.2.3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances`

**Title:** Distances

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Distance in minutes to another school building.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                | Description |
| ------------------------------------------------------------------------------ | ----------- |
| [Distance](#specifications_items_planningData_buildings_items_distances_items) | -           |

###### <a name="specifications_items_planningData_buildings_items_distances_items"></a>3.1.2.3.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances > Distance

**Title:** Distance

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                                                         | Pattern | Type    | Deprecated | Definition | Title/Description                                               |
| ------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------- |
| + [refBuilding](#specifications_items_planningData_buildings_items_distances_items_refBuilding ) | No      | string  | No         | -          | Identifier of the other building that refers to the distance.   |
| + [minutes](#specifications_items_planningData_buildings_items_distances_items_minutes )         | No      | integer | No         | -          | Distance in minutes from the building of the referred building. |

###### <a name="specifications_items_planningData_buildings_items_distances_items_refBuilding"></a>3.1.2.3.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances > Distance > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the other building that refers to the distance.

###### <a name="specifications_items_planningData_buildings_items_distances_items_minutes"></a>3.1.2.3.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > buildings > Building > distances > Distance > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Distance in minutes from the building of the referred building.

##### <a name="specifications_items_planningData_classRooms"></a>3.1.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms`

**Title:** ClassRooms

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains the classrooms to organize the class units.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                  | Description |
| ---------------------------------------------------------------- | ----------- |
| [Classroom](#specifications_items_planningData_classRooms_items) | -           |

###### <a name="specifications_items_planningData_classRooms_items"></a>3.1.2.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom

**Title:** Classroom

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                              | Pattern | Type            | Deprecated | Definition | Title/Description                                                                               |
| ------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_classRooms_items_id )                       | No      | string          | No         | -          | Identifier name of the classroom.                                                               |
| - [shortName](#specifications_items_planningData_classRooms_items_shortName )         | No      | string          | No         | -          | Short name of the classroom                                                                     |
| - [fullName](#specifications_items_planningData_classRooms_items_fullName )           | No      | string          | No         | -          | Complete name of the classroom.                                                                 |
| - [isDedicated](#specifications_items_planningData_classRooms_items_isDedicated )     | No      | boolean         | No         | -          | Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom |
| - [exKey](#specifications_items_planningData_classRooms_items_exKey )                 | No      | string          | No         | -          | External key of the classroom                                                                   |
| - [capacity](#specifications_items_planningData_classRooms_items_capacity )           | No      | integer         | No         | -          | The maximum number of students the classroom can hold.                                          |
| - [frameTemplate](#specifications_items_planningData_classRooms_items_frameTemplate ) | No      | array of object | No         | -          | BannedFrameTemplate                                                                             |
| - [refBuilding](#specifications_items_planningData_classRooms_items_refBuilding )     | No      | string          | No         | -          | Building identifier where the class is located.                                                 |
| - [fullDay](#specifications_items_planningData_classRooms_items_fullDay )             | No      | boolean         | No         | -          | This indicates whether the classroom should be booked all day after holding a subject.          |

###### <a name="specifications_items_planningData_classRooms_items_id"></a>3.1.2.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the classroom.

###### <a name="specifications_items_planningData_classRooms_items_shortName"></a>3.1.2.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the classroom

###### <a name="specifications_items_planningData_classRooms_items_fullName"></a>3.1.2.4.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the classroom.

###### <a name="specifications_items_planningData_classRooms_items_isDedicated"></a>3.1.2.4.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > isDedicated`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom

###### <a name="specifications_items_planningData_classRooms_items_exKey"></a>3.1.2.4.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the classroom

###### <a name="specifications_items_planningData_classRooms_items_capacity"></a>3.1.2.4.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > capacity`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** The maximum number of students the classroom can hold.

###### <a name="specifications_items_planningData_classRooms_items_frameTemplate"></a>3.1.2.4.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate`

**Title:** BannedFrameTemplate

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Template with only banned preferences.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                    | Description                                              |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------- |
| [BannedSectionPreference](#specifications_items_planningData_classRooms_items_frameTemplate_items) | Template with only banned section assignment preference. |

###### <a name="specifications_items_planningData_classRooms_items_frameTemplate_items"></a>3.1.2.4.1.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference

**Title:** BannedSectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Template with only banned section assignment preference.

| Property                                                                                  | Pattern | Type    | Deprecated | Definition | Title/Description                                      |
| ----------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------ |
| + [day](#specifications_items_planningData_classRooms_items_frameTemplate_items_day )     | No      | integer | No         | -          | Day of the week when the section is located.           |
| + [index](#specifications_items_planningData_classRooms_items_frameTemplate_items_index ) | No      | integer | No         | -          | Index built into the day where the section is located. |
| + [frame](#specifications_items_planningData_classRooms_items_frameTemplate_items_frame ) | No      | string  | No         | -          | Frame identifier.                                      |

###### <a name="specifications_items_planningData_classRooms_items_frameTemplate_items_day"></a>3.1.2.4.1.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="specifications_items_planningData_classRooms_items_frameTemplate_items_index"></a>3.1.2.4.1.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="specifications_items_planningData_classRooms_items_frameTemplate_items_frame"></a>3.1.2.4.1.7.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

###### <a name="specifications_items_planningData_classRooms_items_refBuilding"></a>3.1.2.4.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier where the class is located.

###### <a name="specifications_items_planningData_classRooms_items_fullDay"></a>3.1.2.4.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRooms > Classroom > fullDay`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** This indicates whether the classroom should be booked all day after holding a subject.

##### <a name="specifications_items_planningData_classRoomsSets"></a>3.1.2.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets`

**Title:** ClassRoomsSets

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** A division of the classrooms, grouped by organizational characteristics or needs.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                         | Description |
| ----------------------------------------------------------------------- | ----------- |
| [ClassRoomSet](#specifications_items_planningData_classRoomsSets_items) | -           |

###### <a name="specifications_items_planningData_classRoomsSets_items"></a>3.1.2.5.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet

**Title:** ClassRoomSet

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                    | Pattern | Type            | Deprecated | Definition | Title/Description                                                  |
| ------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------------------------------------------ |
| + [id](#specifications_items_planningData_classRoomsSets_items_id )                         | No      | string          | No         | -          | ClassRooms group identifier.                                       |
| + [rooms](#specifications_items_planningData_classRoomsSets_items_rooms )                   | No      | array of string | No         | -          | ClassRoomEntries                                                   |
| - [anonymousRooms](#specifications_items_planningData_classRoomsSets_items_anonymousRooms ) | No      | integer         | No         | -          | Number of non-specific defined classrooms that the group contains. |

###### <a name="specifications_items_planningData_classRoomsSets_items_id"></a>3.1.2.5.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** ClassRooms group identifier.

###### <a name="specifications_items_planningData_classRoomsSets_items_rooms"></a>3.1.2.5.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > rooms`

**Title:** ClassRoomEntries

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** Classrooms identifiers which contain the group.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                     | Description           |
| ----------------------------------------------------------------------------------- | --------------------- |
| [ClassRoomRef](#specifications_items_planningData_classRoomsSets_items_rooms_items) | Classroom identifier. |

###### <a name="specifications_items_planningData_classRoomsSets_items_rooms_items"></a>3.1.2.5.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > rooms > ClassRoomRef

**Title:** ClassRoomRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom identifier.

###### <a name="specifications_items_planningData_classRoomsSets_items_anonymousRooms"></a>3.1.2.5.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > classRoomsSets > ClassRoomSet > anonymousRooms`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of non-specific defined classrooms that the group contains.

##### <a name="specifications_items_planningData_tasks"></a>3.1.2.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks`

**Title:** Tasks

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Types of tasks or activities for the teachers.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                        | Description            |
| ------------------------------------------------------ | ---------------------- |
| [Task](#specifications_items_planningData_tasks_items) | Teacher activity type. |

###### <a name="specifications_items_planningData_tasks_items"></a>3.1.2.6.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task

**Title:** Task

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher activity type.

| Property                                                                                 | Pattern | Type            | Deprecated | Definition               | Title/Description                                     |
| ---------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------ | ----------------------------------------------------- |
| + [id](#specifications_items_planningData_tasks_items_id )                               | No      | string          | No         | -                        | Task identifier.                                      |
| - [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate )         | No      | array of object | No         | In #/$defs/frameTemplate | FrameTemplate                                         |
| - [fullName](#specifications_items_planningData_tasks_items_fullName )                   | No      | string          | No         | -                        | Complete name of the task.                            |
| - [exKey](#specifications_items_planningData_tasks_items_exKey )                         | No      | string          | No         | -                        | External key of the task                              |
| - [refColourInResult](#specifications_items_planningData_tasks_items_refColourInResult ) | No      | string          | No         | -                        | Colour code used to represent the task in the result. |

###### <a name="specifications_items_planningData_tasks_items_id"></a>3.1.2.6.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

###### <a name="specifications_items_planningData_tasks_items_frameTemplate"></a>3.1.2.6.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate`

**Title:** FrameTemplate

|                |                       |
| -------------- | --------------------- |
| **Type**       | `array of object`     |
| **Required**   | No                    |
| **Defined in** | #/$defs/frameTemplate |

**Description:** Templates with frame sections assignment preferences.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                         | Description                                    |
| --------------------------------------------------------------------------------------- | ---------------------------------------------- |
| [SectionPreference](#specifications_items_planningData_tasks_items_frameTemplate_items) | Template with a section assignment preference. |

###### <a name="specifications_items_planningData_tasks_items_frameTemplate_items"></a>3.1.2.6.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference

**Title:** SectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Template with a section assignment preference.

| Property                                                                             | Pattern | Type             | Deprecated | Definition | Title/Description                                  |
| ------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | ---------- | -------------------------------------------------- |
| + [day](#specifications_items_planningData_tasks_items_frameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when is located the section.       |
| + [index](#specifications_items_planningData_tasks_items_frameTemplate_items_index ) | No      | integer          | No         | -          | Index inside the day where is located the section. |
| + [frame](#specifications_items_planningData_tasks_items_frameTemplate_items_frame ) | No      | string           | No         | -          | Identifier name of the frame.                      |
| + [type](#specifications_items_planningData_tasks_items_frameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeWithOutPreset                 |

###### <a name="specifications_items_planningData_tasks_items_frameTemplate_items_day"></a>3.1.2.6.1.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when is located the section.

###### <a name="specifications_items_planningData_tasks_items_frameTemplate_items_index"></a>3.1.2.6.1.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index inside the day where is located the section.

###### <a name="specifications_items_planningData_tasks_items_frameTemplate_items_frame"></a>3.1.2.6.1.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the frame.

###### <a name="specifications_items_planningData_tasks_items_frameTemplate_items_type"></a>3.1.2.6.1.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > frameTemplate > SectionPreference > type`

**Title:** SectionPreferenceTypeWithOutPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Element availability to be assigned to the section.

Must be one of:
* "banned"
* "strong-non-preferred"
* "weak-non-preferred"

###### <a name="specifications_items_planningData_tasks_items_fullName"></a>3.1.2.6.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the task.

###### <a name="specifications_items_planningData_tasks_items_exKey"></a>3.1.2.6.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the task

###### <a name="specifications_items_planningData_tasks_items_refColourInResult"></a>3.1.2.6.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > tasks > Task > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the task in the result.

##### <a name="specifications_items_planningData_teachers"></a>3.1.2.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers`

**Title:** Teachers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Teachers list of the timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                              | Description                                                 |
| ------------------------------------------------------------ | ----------------------------------------------------------- |
| [Teacher](#specifications_items_planningData_teachers_items) | Object with personal information and teachers' preferences. |

###### <a name="specifications_items_planningData_teachers_items"></a>3.1.2.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher

**Title:** Teacher

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Object with personal information and teachers' preferences.

| Property                                                                                            | Pattern | Type            | Deprecated | Definition                                                                             | Title/Description                                                                                                                                    |
| --------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_teachers_items_id )                                       | No      | string          | No         | -                                                                                      | Identifier of the teacher.                                                                                                                           |
| - [shortName](#specifications_items_planningData_teachers_items_shortName )                         | No      | string          | No         | -                                                                                      | Short name of the teacher.                                                                                                                           |
| - [fullName](#specifications_items_planningData_teachers_items_fullName )                           | No      | string          | No         | -                                                                                      | Complete name of the teacher.                                                                                                                        |
| - [exKey](#specifications_items_planningData_teachers_items_exKey )                                 | No      | string          | No         | -                                                                                      | External key of the teacher                                                                                                                          |
| - [associationIdentifier](#specifications_items_planningData_teachers_items_associationIdentifier ) | No      | string          | No         | -                                                                                      | Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport. |
| - [overlappedAssessment](#specifications_items_planningData_teachers_items_overlappedAssessment )   | No      | integer         | No         | -                                                                                      | Number of overlapped evaluation sessions.                                                                                                            |
| - [frameTemplate](#specifications_items_planningData_teachers_items_frameTemplate )                 | No      | array of object | No         | Same as [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate ) | FrameTemplate                                                                                                                                        |
| - [generalSettings](#specifications_items_planningData_teachers_items_generalSettings )             | No      | object          | No         | -                                                                                      | GeneralSettings                                                                                                                                      |
| - [periodSettings](#specifications_items_planningData_teachers_items_periodSettings )               | No      | array of object | No         | -                                                                                      | PeriodsSettings                                                                                                                                      |

###### <a name="specifications_items_planningData_teachers_items_id"></a>3.1.2.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the teacher.

###### <a name="specifications_items_planningData_teachers_items_shortName"></a>3.1.2.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the teacher.

###### <a name="specifications_items_planningData_teachers_items_fullName"></a>3.1.2.7.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the teacher.

###### <a name="specifications_items_planningData_teachers_items_exKey"></a>3.1.2.7.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the teacher

###### <a name="specifications_items_planningData_teachers_items_associationIdentifier"></a>3.1.2.7.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > associationIdentifier`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.

###### <a name="specifications_items_planningData_teachers_items_overlappedAssessment"></a>3.1.2.7.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > overlappedAssessment`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** Number of overlapped evaluation sessions.

| Restrictions |        |
| ------------ | ------ |
| **Minimum**  | &ge; 1 |

###### <a name="specifications_items_planningData_teachers_items_frameTemplate"></a>3.1.2.7.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > frameTemplate`

**Title:** FrameTemplate

|                        |                                                                               |
| ---------------------- | ----------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                             |
| **Required**           | No                                                                            |
| **Same definition as** | [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

###### <a name="specifications_items_planningData_teachers_items_generalSettings"></a>3.1.2.7.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings`

**Title:** GeneralSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.

| Property                                                                                                                | Pattern | Type             | Deprecated | Definition                         | Title/Description                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| - [weeklyStay](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay )                           | No      | object           | No         | In #/$defs/weeklyStay              | WeeklyStay                                                                                                      |
| - [dailyStay](#specifications_items_planningData_teachers_items_generalSettings_dailyStay )                             | No      | object           | No         | In #/$defs/dailyStay               | DailyStay                                                                                                       |
| - [avoidGapsBetweenSesions](#specifications_items_planningData_teachers_items_generalSettings_avoidGapsBetweenSesions ) | No      | boolean          | No         | In #/$defs/avoidGapsBetweenSesions | It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition. |
| - [maxContinuousTeaching](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching )     | No      | object           | No         | In #/$defs/maxContinuousTeaching   | MaxContinuousTeaching                                                                                           |
| - [avoidClassesAroundBreak](#specifications_items_planningData_teachers_items_generalSettings_avoidClassesAroundBreak ) | No      | enum (of string) | No         | In #/$defs/avoidClassesAroundBreak | ConditionType                                                                                                   |
| - [freeTimes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes )                             | No      | object           | No         | In #/$defs/freeTimes               | FreeTimes                                                                                                       |
| - [freePartTimes](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes )                     | No      | object           | No         | In #/$defs/freePartTimes           | FreePartTime                                                                                                    |
| - [incompatibilities](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities )             | No      | object           | No         | In #/$defs/incompatibilities       | Incompatibilities                                                                                               |
| - [dailyOcupation](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation )                   | No      | object           | No         | In #/$defs/dailyOcupation          | DailyOcupation                                                                                                  |
| - [middayReference](#specifications_items_planningData_teachers_items_generalSettings_middayReference )                 | No      | object           | No         | In #/$defs/middayReference         | MiddayReference                                                                                                 |
| - [dailyBuildingTransfers](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers )   | No      | object           | No         | In #/$defs/dailyBuildingTransfers  | DailyBuildingTransfers                                                                                          |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_weeklyStay"></a>3.1.2.7.1.8.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay`

**Title:** WeeklyStay

|                           |                    |
| ------------------------- | ------------------ |
| **Type**                  | `object`           |
| **Required**              | No                 |
| **Additional properties** | Not allowed        |
| **Defined in**            | #/$defs/weeklyStay |

**Description:** It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

| Property                                                                                                               | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay_strict )                       | No      | integer | No         | -          | Strict time in minutes of maximum weekly stay.                                                                                               |
| - [preferable](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay_preferable )               | No      | integer | No         | -          | Ponderable Time in minutes of maximum weeekly stay.                                                                                          |
| - [countAroundMidday](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay_countAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_weeklyStay_strict"></a>3.1.2.7.1.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict time in minutes of maximum weekly stay.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_weeklyStay_preferable"></a>3.1.2.7.1.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Ponderable Time in minutes of maximum weeekly stay.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_weeklyStay_countAroundMidday"></a>3.1.2.7.1.8.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > weeklyStay > countAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyStay"></a>3.1.2.7.1.8.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay`

**Title:** DailyStay

|                           |                   |
| ------------------------- | ----------------- |
| **Type**                  | `object`          |
| **Required**              | No                |
| **Additional properties** | Not allowed       |
| **Defined in**            | #/$defs/dailyStay |

**Description:** This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

| Property                                                                                                              | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                            |
| --------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_dailyStay_strict )                       | No      | integer | No         | -          | Strict time in minutes of maximum daily stay.                                                                                                |
| - [preferable](#specifications_items_planningData_teachers_items_generalSettings_dailyStay_preferable )               | No      | integer | No         | -          | Ponderable Time in minutes of maximum daily stay.                                                                                            |
| - [countAroundMidday](#specifications_items_planningData_teachers_items_generalSettings_dailyStay_countAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyStay_strict"></a>3.1.2.7.1.8.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict time in minutes of maximum daily stay.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyStay_preferable"></a>3.1.2.7.1.8.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Ponderable Time in minutes of maximum daily stay.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyStay_countAroundMidday"></a>3.1.2.7.1.8.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyStay > countAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_avoidGapsBetweenSesions"></a>3.1.2.7.1.8.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > avoidGapsBetweenSesions`

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `boolean`                       |
| **Required**   | No                              |
| **Default**    | `true`                          |
| **Defined in** | #/$defs/avoidGapsBetweenSesions |

**Description:** It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching"></a>3.1.2.7.1.8.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching`

**Title:** MaxContinuousTeaching

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/maxContinuousTeaching |

**Description:** It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

| Property                                                                                                        | Pattern | Type             | Deprecated | Definition               | Title/Description                                  |
| --------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------ | -------------------------------------------------- |
| - [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type )         | No      | enum (of string) | No         | In #/$defs/conditionType | ConditionType                                      |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_minutes )   | No      | integer          | No         | -                        | Maximum continuous teaching time in minutes.       |
| - [minBreak](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_minBreak ) | No      | integer          | No         | -                        | Minimum time period to be considered as break time |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type"></a>3.1.2.7.1.8.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > type`

**Title:** ConditionType

|                |                       |
| -------------- | --------------------- |
| **Type**       | `enum (of string)`    |
| **Required**   | No                    |
| **Defined in** | #/$defs/conditionType |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_minutes"></a>3.1.2.7.1.8.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum continuous teaching time in minutes.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_minBreak"></a>3.1.2.7.1.8.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minBreak`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Minimum time period to be considered as break time

###### <a name="specifications_items_planningData_teachers_items_generalSettings_avoidClassesAroundBreak"></a>3.1.2.7.1.8.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > avoidClassesAroundBreak`

**Title:** ConditionType

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `enum (of string)`              |
| **Required**   | No                              |
| **Default**    | `"ignore"`                      |
| **Defined in** | #/$defs/avoidClassesAroundBreak |

**Description:** It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised or forbidden.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes"></a>3.1.2.7.1.8.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes`

**Title:** FreeTimes

|                           |                   |
| ------------------------- | ----------------- |
| **Type**                  | `object`          |
| **Required**              | No                |
| **Additional properties** | Not allowed       |
| **Defined in**            | #/$defs/freeTimes |

**Description:** It contains the free time spaces that the teacher must have.

| Property                                                                                                                | Pattern | Type   | Deprecated | Definition | Title/Description           |
| ----------------------------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | --------------------------- |
| - [fullDay](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay )                       | No      | object | No         | -          | FullDaysFreeTimes           |
| - [firstMinutes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes )             | No      | object | No         | -          | FirstMinutesFreeTimes       |
| - [lastMinutes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes )               | No      | object | No         | -          | LastMinutesFreeTimes        |
| - [consecutiveAnyTime](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime ) | No      | object | No         | -          | ConsecutiveAnyTimeFreeTimes |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay"></a>3.1.2.7.1.8.6.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay`

**Title:** FullDaysFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's full days of free time.

| Property                                                                                                              | Pattern | Type    | Deprecated | Definition | Title/Description                                     |
| --------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------- |
| - [strictDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay_strictDays )       | No      | integer | No         | -          | Number of strict days when teacher should be free.    |
| - [preferredDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay_preferredDays ) | No      | integer | No         | -          | Number of preferred days when teacher should be free. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay_strictDays"></a>3.1.2.7.1.8.6.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of strict days when teacher should be free.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_fullDay_preferredDays"></a>3.1.2.7.1.8.6.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of preferred days when teacher should be free.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes"></a>3.1.2.7.1.8.6.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes`

**Title:** FirstMinutesFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's free intervals at the beginning of the day.

| Property                                                                                                                   | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------- |
| - [strictDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free at the beginning of the day.      |
| - [preferredDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free at the beginning of the day. |
| + [minutes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_minutes )             | No      | integer | No         | -          | Minutes of free time at the beginning of the day.                                                        |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_strictDays"></a>3.1.2.7.1.8.6.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free at the beginning of the day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays"></a>3.1.2.7.1.8.6.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free at the beginning of the day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_firstMinutes_minutes"></a>3.1.2.7.1.8.6.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time at the beginning of the day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes"></a>3.1.2.7.1.8.6.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes`

**Title:** LastMinutesFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's free intervals at the end of the day.

| Property                                                                                                                  | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------- |
| - [strictDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free at the end of the day.        |
| - [preferredDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free at the end of the day. . |
| + [minutes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_minutes )             | No      | integer | No         | -          | Minutes of free time at the end of the day.                                                          |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_strictDays"></a>3.1.2.7.1.8.6.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free at the end of the day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays"></a>3.1.2.7.1.8.6.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free at the end of the day. .

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_lastMinutes_minutes"></a>3.1.2.7.1.8.6.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time at the end of the day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime"></a>3.1.2.7.1.8.6.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime`

**Title:** ConsecutiveAnyTimeFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's free intervals at any time of the day.

| Property                                                                                                                         | Pattern | Type    | Deprecated | Definition | Title/Description                                                             |
| -------------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------- |
| - [strictDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free.       |
| - [preferredDays](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free.  |
| + [minutes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes )             | No      | integer | No         | -          | Minutes of free time interval.                                                |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays"></a>3.1.2.7.1.8.6.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free. 

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays"></a>3.1.2.7.1.8.6.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free. 

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes"></a>3.1.2.7.1.8.6.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time interval.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes"></a>3.1.2.7.1.8.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes`

**Title:** FreePartTime

|                           |                       |
| ------------------------- | --------------------- |
| **Type**                  | `object`              |
| **Required**              | No                    |
| **Additional properties** | Not allowed           |
| **Defined in**            | #/$defs/freePartTimes |

**Description:** Free half-time periods .

| Property                                                                                                        | Pattern | Type   | Deprecated | Definition | Title/Description         |
| --------------------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | ------------------------- |
| - [mornings](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings )         | No      | object | No         | -          | MorningsFreePartTimes     |
| - [afternoons](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons )     | No      | object | No         | -          | AfternoonFreePartTimes    |
| - [indistinctly](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly ) | No      | object | No         | -          | IndistinctlyFreePartTimes |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings"></a>3.1.2.7.1.8.7.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings`

**Title:** MorningsFreePartTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Mornings off.

| Property                                                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                  |
| -------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------- |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings_strict )         | No      | integer | No         | -          | Strict number of mornings off.     |
| - [preferable](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings_preferable ) | No      | integer | No         | -          | Preferable number of mornings off. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings_strict"></a>3.1.2.7.1.8.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of mornings off.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_mornings_preferable"></a>3.1.2.7.1.8.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of mornings off.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons"></a>3.1.2.7.1.8.7.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons`

**Title:** AfternoonFreePartTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Afternoons off.

| Property                                                                                                               | Pattern | Type    | Deprecated | Definition | Title/Description                    |
| ---------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------ |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons_strict )         | No      | integer | No         | -          | Strict number of afternoons off..    |
| - [preferable](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons_preferable ) | No      | integer | No         | -          | Preferable number of afternoons off. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons_strict"></a>3.1.2.7.1.8.7.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of afternoons off..

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_afternoons_preferable"></a>3.1.2.7.1.8.7.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of afternoons off.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly"></a>3.1.2.7.1.8.7.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly`

**Title:** IndistinctlyFreePartTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Free mornings or evenings indistinctly.

| Property                                                                                                                 | Pattern | Type    | Deprecated | Definition | Title/Description                                             |
| ------------------------------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------- |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly_strict )         | No      | integer | No         | -          | Strict number of mornings or afternoons indistinctly off.     |
| - [preferable](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly_preferable ) | No      | integer | No         | -          | Preferable number of mornings or afternoons indistinctly off. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly_strict"></a>3.1.2.7.1.8.7.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of mornings or afternoons indistinctly off.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_freePartTimes_indistinctly_preferable"></a>3.1.2.7.1.8.7.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of mornings or afternoons indistinctly off.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities"></a>3.1.2.7.1.8.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities`

**Title:** Incompatibilities

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/incompatibilities |

**Description:** It contains the teacher's incompatibilities on the allocation of class units and rest periods.

| Property                                                                                                                                                                                                                      | Pattern | Type             | Deprecated | Definition                       | Title/Description                                      |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | -------------------------------- | ------------------------------------------------------ |
| - [freeTimeBetweenDayBeforeAndCurrent](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent )                                                               | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeBetweenDays                                    |
| - [freeTimeBetweenEndWeekAndStartWeekDays](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays )                                                       | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeBetweenWeeksBorders                            |
| - [freeTimeFirstOrLastHoursDay](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay )                                                                             | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeFirstOrLastHoursDay                            |
| - [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection ) | No      | enum (of string) | No         | -                                | DoNotFinishAtLastAfternoonSection                      |
| - [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection )         | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSection                        |
| - [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection )         | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon |
| - [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment )                     | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSectionIfHasAfternoon          |
| - [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment )                     | No      | enum (of string) | No         | -                                | DoNotStartAtFirstMorningSection                        |
| - [freeTimeAroundMidday](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday )                                                                                           | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeAroundMidday                                   |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent"></a>3.1.2.7.1.8.8.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent`

**Title:** FreeTimeBetweenDays

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes between departure and arrival of the following day.

| Property                                                                                                                                     | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                     |
| -------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                                             | Custom time in minutes for condition. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.1.2.7.1.8.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | Yes                                                                                                  |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.1.2.7.1.8.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays"></a>3.1.2.7.1.8.8.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenEndWeekAndStartWeekDays`

**Title:** FreeTimeBetweenWeeksBorders

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes between the end time of the last day of the week and the start time of the following week.

| Property                                                                                                                                     | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                     |
| -------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                                             | Custom time in minutes for condition. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.1.2.7.1.8.8.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | Yes                                                                                                  |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.1.2.7.1.8.8.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay"></a>3.1.2.7.1.8.8.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeFirstOrLastHoursDay`

**Title:** FreeTimeFirstOrLastHoursDay

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes of free time at first or last hours of the day.

| Property                                                                                                                                     | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                     |
| -------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                                             | Custom time in minutes for condition. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.1.2.7.1.8.8.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | Yes                                                                                                  |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.1.2.7.1.8.8.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection"></a>3.1.2.7.1.8.8.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

**Title:** DoNotFinishAtLastAfternoonSection

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** o not finish at the last hour of the evening and start at the first.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection"></a>3.1.2.7.1.8.8.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

**Title:** DoNotFinishAtLastMorningSection

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not start at the first hour and finish at the last hour of the morning.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection"></a>3.1.2.7.1.8.8.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

**Title:** DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not finish at the last hour of the morning and start at the first hour of the evening.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment"></a>3.1.2.7.1.8.8.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

**Title:** DoNotFinishAtLastMorningSectionIfHasAfternoon

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not finish at the last hour in the morning and have the evening busy.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment"></a>3.1.2.7.1.8.8.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

**Title:** DoNotStartAtFirstMorningSection

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not start at the first hour and keep the evening busy.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday"></a>3.1.2.7.1.8.8.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeAroundMidday`

**Title:** FreeTimeAroundMidday

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Do not have less than a custom free time around noon pause.

| Property                                                                                                                                     | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                     |
| -------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                                             | Custom time in minutes for condition. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.1.2.7.1.8.8.9.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | Yes                                                                                                  |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.1.2.7.1.8.8.9.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation"></a>3.1.2.7.1.8.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation`

**Title:** DailyOcupation

|                           |                        |
| ------------------------- | ---------------------- |
| **Type**                  | `object`               |
| **Required**              | No                     |
| **Additional properties** | Not allowed            |
| **Defined in**            | #/$defs/dailyOcupation |

**Description:** Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

| Property                                                                                                                 | Pattern | Type    | Deprecated | Definition                   | Title/Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| - [allowFreeDays](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_allowFreeDays )       | No      | boolean | No         | -                            | It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked. |
| - [minimumTeaching](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching )   | No      | object  | No         | In #/$defs/conditionOcupancy | MinimumTeaching                                                                                                          |
| - [maximumTeaching](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_maximumTeaching )   | No      | object  | No         | In #/$defs/conditionOcupancy | MaximumTeaching                                                                                                          |
| - [minimumOccupancy](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumOccupancy ) | No      | object  | No         | In #/$defs/conditionOcupancy | MinimumOccupancy                                                                                                         |
| - [maximumOccupancy](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_maximumOccupancy ) | No      | object  | No         | In #/$defs/conditionOcupancy | MaximumOccupancy                                                                                                         |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_allowFreeDays"></a>3.1.2.7.1.8.9.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > allowFreeDays`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching"></a>3.1.2.7.1.8.9.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching`

**Title:** MinimumTeaching

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Minimum teaching time of the teacher with students.

| Property                                                                                                                           | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                                                           |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                                             | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                                             | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                                             | time in minutes you add to the assisted time so you generate the total time |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.1.2.7.1.8.9.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | No                                                                                                   |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.1.2.7.1.8.9.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.1.2.7.1.8.9.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.1.2.7.1.8.9.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_maximumTeaching"></a>3.1.2.7.1.8.9.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumTeaching`

**Title:** MaximumTeaching

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Maximun teaching time of the teacher with students.

| Property                                                                                                                           | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                                                           |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                                             | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                                             | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                                             | time in minutes you add to the assisted time so you generate the total time |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.1.2.7.1.8.9.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | No                                                                                                   |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.1.2.7.1.8.9.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.1.2.7.1.8.9.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.1.2.7.1.8.9.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumOccupancy"></a>3.1.2.7.1.8.9.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumOccupancy`

**Title:** MinimumOccupancy

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Property                                                                                                                           | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                                                           |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                                             | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                                             | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                                             | time in minutes you add to the assisted time so you generate the total time |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.1.2.7.1.8.9.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | No                                                                                                   |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.1.2.7.1.8.9.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.1.2.7.1.8.9.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.1.2.7.1.8.9.4.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_maximumOccupancy"></a>3.1.2.7.1.8.9.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumOccupancy`

**Title:** MaximumOccupancy

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Property                                                                                                                           | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                                                           |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                                             | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                                             | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                                             | time in minutes you add to the assisted time so you generate the total time |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.1.2.7.1.8.9.5.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | No                                                                                                   |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.1.2.7.1.8.9.5.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.1.2.7.1.8.9.5.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.1.2.7.1.8.9.5.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="specifications_items_planningData_teachers_items_generalSettings_middayReference"></a>3.1.2.7.1.8.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > middayReference`

**Title:** MiddayReference

|                           |                         |
| ------------------------- | ----------------------- |
| **Type**                  | `object`                |
| **Required**              | No                      |
| **Additional properties** | Not allowed             |
| **Defined in**            | #/$defs/middayReference |

**Description:** It indicate the frame where the teacher takes noon pause.

| Property                                                                                                  | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [refFrame](#specifications_items_planningData_teachers_items_generalSettings_middayReference_refFrame ) | No      | string  | No         | -          | Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.                        |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_middayReference_strict )     | No      | boolean | No         | -          | It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_middayReference_refFrame"></a>3.1.2.7.1.8.10.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > middayReference > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_middayReference_strict"></a>3.1.2.7.1.8.10.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > middayReference > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers"></a>3.1.2.7.1.8.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers`

**Title:** DailyBuildingTransfers

|                           |                                |
| ------------------------- | ------------------------------ |
| **Type**                  | `object`                       |
| **Required**              | No                             |
| **Additional properties** | Not allowed                    |
| **Defined in**            | #/$defs/dailyBuildingTransfers |

**Description:** Maximum number of movements between buildings that the teacher can make per day.

| Property                                                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                                   |
| -------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------- |
| - [strict](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers_strict )         | No      | integer | No         | -          | Strict maximum number of movements per day.                         |
| - [preferable](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers_preferable ) | No      | integer | No         | -          | Maximum number of movements per day that can be weighted/preferred. |

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers_strict"></a>3.1.2.7.1.8.11.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict maximum number of movements per day.

###### <a name="specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers_preferable"></a>3.1.2.7.1.8.11.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum number of movements per day that can be weighted/preferred.

###### <a name="specifications_items_planningData_teachers_items_periodSettings"></a>3.1.2.7.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings`

**Title:** PeriodsSettings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Strict and measurable teacher's conditions customized by week/period

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                         | Description |
| --------------------------------------------------------------------------------------- | ----------- |
| [PeriodSetting](#specifications_items_planningData_teachers_items_periodSettings_items) | -           |

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items"></a>3.1.2.7.1.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting

**Title:** PeriodSetting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                                                                                     | Pattern | Type             | Deprecated | Definition                                                                                                                    | Title/Description                                                                                               |
| ---------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| + [refPeriod](#specifications_items_planningData_teachers_items_periodSettings_items_refPeriod )                             | No      | string           | No         | -                                                                                                                             | Identifier of the period to which the settings affect.                                                          |
| - [weeklyStay](#specifications_items_planningData_teachers_items_periodSettings_items_weeklyStay )                           | No      | object           | No         | Same as [weeklyStay](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay )                           | WeeklyStay                                                                                                      |
| - [dailyStay](#specifications_items_planningData_teachers_items_periodSettings_items_dailyStay )                             | No      | object           | No         | Same as [dailyStay](#specifications_items_planningData_teachers_items_generalSettings_dailyStay )                             | DailyStay                                                                                                       |
| - [avoidGapsBetweenSesions](#specifications_items_planningData_teachers_items_periodSettings_items_avoidGapsBetweenSesions ) | No      | boolean          | No         | Same as [avoidGapsBetweenSesions](#specifications_items_planningData_teachers_items_generalSettings_avoidGapsBetweenSesions ) | It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition. |
| - [maxContinuousTeaching](#specifications_items_planningData_teachers_items_periodSettings_items_maxContinuousTeaching )     | No      | object           | No         | Same as [maxContinuousTeaching](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching )     | MaxContinuousTeaching                                                                                           |
| - [avoidClassesAroundBreak](#specifications_items_planningData_teachers_items_periodSettings_items_avoidClassesAroundBreak ) | No      | enum (of string) | No         | Same as [avoidClassesAroundBreak](#specifications_items_planningData_teachers_items_generalSettings_avoidClassesAroundBreak ) | ConditionType                                                                                                   |
| - [freeTimes](#specifications_items_planningData_teachers_items_periodSettings_items_freeTimes )                             | No      | object           | No         | Same as [freeTimes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes )                             | FreeTimes                                                                                                       |
| - [freePartTimes](#specifications_items_planningData_teachers_items_periodSettings_items_freePartTimes )                     | No      | object           | No         | Same as [freePartTimes](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes )                     | FreePartTime                                                                                                    |
| - [incompatibilities](#specifications_items_planningData_teachers_items_periodSettings_items_incompatibilities )             | No      | object           | No         | Same as [incompatibilities](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities )             | Incompatibilities                                                                                               |
| - [dailyOcupation](#specifications_items_planningData_teachers_items_periodSettings_items_dailyOcupation )                   | No      | object           | No         | Same as [dailyOcupation](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation )                   | DailyOcupation                                                                                                  |
| - [middayReference](#specifications_items_planningData_teachers_items_periodSettings_items_middayReference )                 | No      | object           | No         | Same as [middayReference](#specifications_items_planningData_teachers_items_generalSettings_middayReference )                 | MiddayReference                                                                                                 |
| - [dailyBuildingTransfers](#specifications_items_planningData_teachers_items_periodSettings_items_dailyBuildingTransfers )   | No      | object           | No         | Same as [dailyBuildingTransfers](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers )   | DailyBuildingTransfers                                                                                          |

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_refPeriod"></a>3.1.2.7.1.9.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > refPeriod`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the period to which the settings affect.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_weeklyStay"></a>3.1.2.7.1.9.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > weeklyStay`

**Title:** WeeklyStay

|                           |                                                                                            |
| ------------------------- | ------------------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                                   |
| **Required**              | No                                                                                         |
| **Additional properties** | Not allowed                                                                                |
| **Same definition as**    | [weeklyStay](#specifications_items_planningData_teachers_items_generalSettings_weeklyStay) |

**Description:** It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_dailyStay"></a>3.1.2.7.1.9.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyStay`

**Title:** DailyStay

|                           |                                                                                          |
| ------------------------- | ---------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                 |
| **Required**              | No                                                                                       |
| **Additional properties** | Not allowed                                                                              |
| **Same definition as**    | [dailyStay](#specifications_items_planningData_teachers_items_generalSettings_dailyStay) |

**Description:** This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_avoidGapsBetweenSesions"></a>3.1.2.7.1.9.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidGapsBetweenSesions`

|                        |                                                                                                                      |
| ---------------------- | -------------------------------------------------------------------------------------------------------------------- |
| **Type**               | `boolean`                                                                                                            |
| **Required**           | No                                                                                                                   |
| **Default**            | `true`                                                                                                               |
| **Same definition as** | [avoidGapsBetweenSesions](#specifications_items_planningData_teachers_items_generalSettings_avoidGapsBetweenSesions) |

**Description:** It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_maxContinuousTeaching"></a>3.1.2.7.1.9.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > maxContinuousTeaching`

**Title:** MaxContinuousTeaching

|                           |                                                                                                                  |
| ------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                                         |
| **Required**              | No                                                                                                               |
| **Additional properties** | Not allowed                                                                                                      |
| **Same definition as**    | [maxContinuousTeaching](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching) |

**Description:** It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_avoidClassesAroundBreak"></a>3.1.2.7.1.9.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidClassesAroundBreak`

**Title:** ConditionType

|                        |                                                                                                                      |
| ---------------------- | -------------------------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                                   |
| **Required**           | No                                                                                                                   |
| **Default**            | `"ignore"`                                                                                                           |
| **Same definition as** | [avoidClassesAroundBreak](#specifications_items_planningData_teachers_items_generalSettings_avoidClassesAroundBreak) |

**Description:** It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised or forbidden.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_freeTimes"></a>3.1.2.7.1.9.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > freeTimes`

**Title:** FreeTimes

|                           |                                                                                          |
| ------------------------- | ---------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                 |
| **Required**              | No                                                                                       |
| **Additional properties** | Not allowed                                                                              |
| **Same definition as**    | [freeTimes](#specifications_items_planningData_teachers_items_generalSettings_freeTimes) |

**Description:** It contains the free time spaces that the teacher must have.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_freePartTimes"></a>3.1.2.7.1.9.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > freePartTimes`

**Title:** FreePartTime

|                           |                                                                                                  |
| ------------------------- | ------------------------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                                         |
| **Required**              | No                                                                                               |
| **Additional properties** | Not allowed                                                                                      |
| **Same definition as**    | [freePartTimes](#specifications_items_planningData_teachers_items_generalSettings_freePartTimes) |

**Description:** Free half-time periods .

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_incompatibilities"></a>3.1.2.7.1.9.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > incompatibilities`

**Title:** Incompatibilities

|                           |                                                                                                          |
| ------------------------- | -------------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                                 |
| **Required**              | No                                                                                                       |
| **Additional properties** | Not allowed                                                                                              |
| **Same definition as**    | [incompatibilities](#specifications_items_planningData_teachers_items_generalSettings_incompatibilities) |

**Description:** It contains the teacher's incompatibilities on the allocation of class units and rest periods.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_dailyOcupation"></a>3.1.2.7.1.9.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyOcupation`

**Title:** DailyOcupation

|                           |                                                                                                    |
| ------------------------- | -------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                           |
| **Required**              | No                                                                                                 |
| **Additional properties** | Not allowed                                                                                        |
| **Same definition as**    | [dailyOcupation](#specifications_items_planningData_teachers_items_generalSettings_dailyOcupation) |

**Description:** Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_middayReference"></a>3.1.2.7.1.9.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > middayReference`

**Title:** MiddayReference

|                           |                                                                                                      |
| ------------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                             |
| **Required**              | No                                                                                                   |
| **Additional properties** | Not allowed                                                                                          |
| **Same definition as**    | [middayReference](#specifications_items_planningData_teachers_items_generalSettings_middayReference) |

**Description:** It indicate the frame where the teacher takes noon pause.

###### <a name="specifications_items_planningData_teachers_items_periodSettings_items_dailyBuildingTransfers"></a>3.1.2.7.1.9.1.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyBuildingTransfers`

**Title:** DailyBuildingTransfers

|                           |                                                                                                                    |
| ------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                                                           |
| **Required**              | No                                                                                                                 |
| **Additional properties** | Not allowed                                                                                                        |
| **Same definition as**    | [dailyBuildingTransfers](#specifications_items_planningData_teachers_items_generalSettings_dailyBuildingTransfers) |

**Description:** Maximum number of movements between buildings that the teacher can make per day.

##### <a name="specifications_items_planningData_subjects"></a>3.1.2.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects`

**Title:** Subjects

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** School subjects taught in the class units.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                              | Description |
| ------------------------------------------------------------ | ----------- |
| [Subject](#specifications_items_planningData_subjects_items) | -           |

###### <a name="specifications_items_planningData_subjects_items"></a>3.1.2.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject

**Title:** Subject

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                          | Pattern | Type             | Deprecated | Definition                                                                             | Title/Description                                                    |
| ------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_subjects_items_id )                                     | No      | string           | No         | -                                                                                      | Subject identifier.                                                  |
| - [shortName](#specifications_items_planningData_subjects_items_shortName )                       | No      | string           | No         | -                                                                                      | Short name of the subject.                                           |
| - [fullName](#specifications_items_planningData_subjects_items_fullName )                         | No      | string           | No         | -                                                                                      | Complete name of the subject.                                        |
| - [exKey](#specifications_items_planningData_subjects_items_exKey )                               | No      | string           | No         | -                                                                                      | External key of the subject                                          |
| - [isStudentMentoring](#specifications_items_planningData_subjects_items_isStudentMentoring )     | No      | boolean          | No         | -                                                                                      | Indicates whether the subject is a tutoring session with students    |
| - [technicalTeacher](#specifications_items_planningData_subjects_items_technicalTeacher )         | No      | boolean          | No         | -                                                                                      | It indicates whether the subject is teach by technical teacher.      |
| - [type](#specifications_items_planningData_subjects_items_type )                                 | No      | enum (of string) | No         | -                                                                                      | Type of the subject                                                  |
| - [refClassroom](#specifications_items_planningData_subjects_items_refClassroom )                 | No      | string           | No         | -                                                                                      | Id of the classroom assigned to teach the subject.                   |
| - [refClassRoomSetsList](#specifications_items_planningData_subjects_items_refClassRoomSetsList ) | No      | array of string  | No         | -                                                                                      | List of alternative classroom sets assigned to schedule the subject. |
| - [refColourInResult](#specifications_items_planningData_subjects_items_refColourInResult )       | No      | string           | No         | -                                                                                      | Colour code used to represent the subject in the result.             |
| - [frameTemplate](#specifications_items_planningData_subjects_items_frameTemplate )               | No      | array of object  | No         | Same as [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate ) | FrameTemplate                                                        |

###### <a name="specifications_items_planningData_subjects_items_id"></a>3.1.2.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Subject identifier.

###### <a name="specifications_items_planningData_subjects_items_shortName"></a>3.1.2.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the subject.

###### <a name="specifications_items_planningData_subjects_items_fullName"></a>3.1.2.8.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the subject.

###### <a name="specifications_items_planningData_subjects_items_exKey"></a>3.1.2.8.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the subject

###### <a name="specifications_items_planningData_subjects_items_isStudentMentoring"></a>3.1.2.8.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > isStudentMentoring`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates whether the subject is a tutoring session with students

###### <a name="specifications_items_planningData_subjects_items_technicalTeacher"></a>3.1.2.8.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > technicalTeacher`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether the subject is teach by technical teacher.

###### <a name="specifications_items_planningData_subjects_items_type"></a>3.1.2.8.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > type`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Type of the subject

Must be one of:
* "core"
* "specific"
* "elective"
* "mentoring"

###### <a name="specifications_items_planningData_subjects_items_refClassroom"></a>3.1.2.8.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refClassroom`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the classroom assigned to teach the subject.

###### <a name="specifications_items_planningData_subjects_items_refClassRoomSetsList"></a>3.1.2.8.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refClassRoomSetsList`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of alternative classroom sets assigned to schedule the subject.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                 | Description               |
| ----------------------------------------------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#specifications_items_planningData_subjects_items_refClassRoomSetsList_items) | Classroom set identifier. |

###### <a name="specifications_items_planningData_subjects_items_refClassRoomSetsList_items"></a>3.1.2.8.1.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refClassRoomSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

###### <a name="specifications_items_planningData_subjects_items_refColourInResult"></a>3.1.2.8.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the subject in the result.

###### <a name="specifications_items_planningData_subjects_items_frameTemplate"></a>3.1.2.8.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > subjects > Subject > frameTemplate`

**Title:** FrameTemplate

|                        |                                                                               |
| ---------------------- | ----------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                             |
| **Required**           | No                                                                            |
| **Same definition as** | [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

##### <a name="specifications_items_planningData_groups"></a>3.1.2.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups`

**Title:** Groups

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Sets of students. A group with includedGroups is considered a group set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                          | Description |
| -------------------------------------------------------- | ----------- |
| [Group](#specifications_items_planningData_groups_items) | -           |

###### <a name="specifications_items_planningData_groups_items"></a>3.1.2.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group

**Title:** Group

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                                | Pattern | Type             | Deprecated | Definition                                                                                                    | Title/Description                                                                                                                |
| ------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_groups_items_id )                                             | No      | string           | No         | -                                                                                                             | Group identifier.                                                                                                                |
| - [shortName](#specifications_items_planningData_groups_items_shortName )                               | No      | string           | No         | -                                                                                                             | Short name of the group.                                                                                                         |
| - [fullName](#specifications_items_planningData_groups_items_fullName )                                 | No      | string           | No         | -                                                                                                             | Complete name of the group.                                                                                                      |
| - [exKey](#specifications_items_planningData_groups_items_exKey )                                       | No      | string           | No         | -                                                                                                             | External key of the subject                                                                                                      |
| + [refFrame](#specifications_items_planningData_groups_items_refFrame )                                 | No      | string           | No         | -                                                                                                             | Group's frame identifier.                                                                                                        |
| - [frameTemplate](#specifications_items_planningData_groups_items_frameTemplate )                       | No      | array of object  | No         | Same as [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate )                        | FrameTemplate                                                                                                                    |
| - [numStudents](#specifications_items_planningData_groups_items_numStudents )                           | No      | integer          | No         | -                                                                                                             | Number of students in the group.                                                                                                 |
| - [freeAfternoons](#specifications_items_planningData_groups_items_freeAfternoons )                     | No      | integer          | No         | -                                                                                                             | Stric number of free afternoons for the group.                                                                                   |
| - [notGaps](#specifications_items_planningData_groups_items_notGaps )                                   | No      | enum (of string) | No         | Same as [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                                                                                    |
| - [gapsAlwaysInNonPreferred](#specifications_items_planningData_groups_items_gapsAlwaysInNonPreferred ) | No      | boolean          | No         | -                                                                                                             | This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps. |
| - [refCourse](#specifications_items_planningData_groups_items_refCourse )                               | No      | string           | No         | -                                                                                                             | Course identifier to which the group belongs.                                                                                    |
| - [includedGroups](#specifications_items_planningData_groups_items_includedGroups )                     | No      | array of string  | No         | -                                                                                                             | Identifiers of the groups included in this group. A group that defines this property is considered a group set.                  |
| - [refTeacher](#specifications_items_planningData_groups_items_refTeacher )                             | No      | string           | No         | -                                                                                                             | Id of the tutor teacher assigned to the group                                                                                    |
| - [refClassroom](#specifications_items_planningData_groups_items_refClassroom )                         | No      | string           | No         | -                                                                                                             | Id of the classroom assigned to the group                                                                                        |
| - [refClassRoomSetsList](#specifications_items_planningData_groups_items_refClassRoomSetsList )         | No      | array of string  | No         | -                                                                                                             | List of classroom sets assigned to the group.                                                                                    |

###### <a name="specifications_items_planningData_groups_items_id"></a>3.1.2.9.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group identifier.

###### <a name="specifications_items_planningData_groups_items_shortName"></a>3.1.2.9.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the group.

###### <a name="specifications_items_planningData_groups_items_fullName"></a>3.1.2.9.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the group.

###### <a name="specifications_items_planningData_groups_items_exKey"></a>3.1.2.9.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the subject

###### <a name="specifications_items_planningData_groups_items_refFrame"></a>3.1.2.9.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group's frame identifier.

###### <a name="specifications_items_planningData_groups_items_frameTemplate"></a>3.1.2.9.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > frameTemplate`

**Title:** FrameTemplate

|                        |                                                                               |
| ---------------------- | ----------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                             |
| **Required**           | No                                                                            |
| **Same definition as** | [frameTemplate](#specifications_items_planningData_tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

###### <a name="specifications_items_planningData_groups_items_numStudents"></a>3.1.2.9.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > numStudents`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Number of students in the group.

###### <a name="specifications_items_planningData_groups_items_freeAfternoons"></a>3.1.2.9.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > freeAfternoons`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Stric number of free afternoons for the group.

###### <a name="specifications_items_planningData_groups_items_notGaps"></a>3.1.2.9.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > notGaps`

**Title:** ConditionType

|                        |                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                   |
| **Required**           | No                                                                                                   |
| **Same definition as** | [type](#specifications_items_planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** It indicates if the group can have gaps in its timetable.

###### <a name="specifications_items_planningData_groups_items_gapsAlwaysInNonPreferred"></a>3.1.2.9.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > gapsAlwaysInNonPreferred`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.

###### <a name="specifications_items_planningData_groups_items_refCourse"></a>3.1.2.9.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refCourse`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Course identifier to which the group belongs.

###### <a name="specifications_items_planningData_groups_items_includedGroups"></a>3.1.2.9.1.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > includedGroups`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Identifiers of the groups included in this group. A group that defines this property is considered a group set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                   | Description        |
| --------------------------------------------------------------------------------- | ------------------ |
| [refGroups](#specifications_items_planningData_groups_items_includedGroups_items) | Groups identifier. |

###### <a name="specifications_items_planningData_groups_items_includedGroups_items"></a>3.1.2.9.1.12.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > includedGroups > refGroups

**Title:** refGroups

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Groups identifier.

###### <a name="specifications_items_planningData_groups_items_refTeacher"></a>3.1.2.9.1.13. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refTeacher`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the tutor teacher assigned to the group

###### <a name="specifications_items_planningData_groups_items_refClassroom"></a>3.1.2.9.1.14. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refClassroom`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the classroom assigned to the group

###### <a name="specifications_items_planningData_groups_items_refClassRoomSetsList"></a>3.1.2.9.1.15. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refClassRoomSetsList`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of classroom sets assigned to the group.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                               | Description               |
| --------------------------------------------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#specifications_items_planningData_groups_items_refClassRoomSetsList_items) | Classroom set identifier. |

###### <a name="specifications_items_planningData_groups_items_refClassRoomSetsList_items"></a>3.1.2.9.1.15.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groups > Group > refClassRoomSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

##### <a name="specifications_items_planningData_groupSetRelations"></a>3.1.2.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations`

**Title:** GroupSetRelations

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | No      |

**Description:** Relationships between group sets that indicate whether their included groups can be scheduled simultaneously.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                | Description                                                                       |
| ------------------------------------------------------------------------------ | --------------------------------------------------------------------------------- |
| [GroupSetRelation](#specifications_items_planningData_groupSetRelations_items) | Relationship between group sets represented by Group objects with includedGroups. |

###### <a name="specifications_items_planningData_groupSetRelations_items"></a>3.1.2.10.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation

**Title:** GroupSetRelation

|                           |                          |
| ------------------------- | ------------------------ |
| **Type**                  | `object`                 |
| **Required**              | No                       |
| **Additional properties** | Not allowed              |
| **Defined in**            | #/$defs/groupSetRelation |

**Description:** Relationship between group sets represented by Group objects with includedGroups.

| Property                                                                               | Pattern | Type    | Deprecated | Definition                            | Title/Description                                          |
| -------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ------------------------------------- | ---------------------------------------------------------- |
| + [id](#specifications_items_planningData_groupSetRelations_items_id )                 | No      | integer | No         | -                                     | Group set relationship identifier.                         |
| - [alias](#specifications_items_planningData_groupSetRelations_items_alias )           | No      | string  | No         | -                                     | Optional name used to identify the group set relationship. |
| + [expression](#specifications_items_planningData_groupSetRelations_items_expression ) | No      | object  | No         | In #/$defs/groupSetRelationExpression | GroupSetRelationExpression                                 |

###### <a name="specifications_items_planningData_groupSetRelations_items_id"></a>3.1.2.10.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Group set relationship identifier.

###### <a name="specifications_items_planningData_groupSetRelations_items_alias"></a>3.1.2.10.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Optional name used to identify the group set relationship.

###### <a name="specifications_items_planningData_groupSetRelations_items_expression"></a>3.1.2.10.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression`

**Title:** GroupSetRelationExpression

|                           |                                    |
| ------------------------- | ---------------------------------- |
| **Type**                  | `object`                           |
| **Required**              | Yes                                |
| **Additional properties** | Not allowed                        |
| **Defined in**            | #/$defs/groupSetRelationExpression |

**Description:** Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.

| Property                                                                                                                        | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [operator](#specifications_items_planningData_groupSetRelations_items_expression_operator )                                   | No      | enum (of string) | No         | -          | Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding. |
| - [refGroupSet](#specifications_items_planningData_groupSetRelations_items_expression_refGroupSet )                             | No      | array of string  | No         | -          | GroupSetRelationMembers                                                                                                                                          |
| - [nestedRelationExpressions](#specifications_items_planningData_groupSetRelations_items_expression_nestedRelationExpressions ) | No      | array            | No         | -          | NestedRelationExpressions                                                                                                                                        |

###### <a name="specifications_items_planningData_groupSetRelations_items_expression_operator"></a>3.1.2.10.1.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > operator`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.

Must be one of:
* "COMPATIBLE"
* "EXCLUSIVE"

###### <a name="specifications_items_planningData_groupSetRelations_items_expression_refGroupSet"></a>3.1.2.10.1.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet`

**Title:** GroupSetRelationMembers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of group set identifiers.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                              | Description                                                                            |
| ------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| [GroupSetReference](#specifications_items_planningData_groupSetRelations_items_expression_refGroupSet_items) | Identifier of a Group that represents a group set through its includedGroups property. |

###### <a name="specifications_items_planningData_groupSetRelations_items_expression_refGroupSet_items"></a>3.1.2.10.1.3.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet > GroupSetReference

**Title:** GroupSetReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of a Group that represents a group set through its includedGroups property.

###### <a name="specifications_items_planningData_groupSetRelations_items_expression_nestedRelationExpressions"></a>3.1.2.10.1.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions`

**Title:** NestedRelationExpressions

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | No      |

**Description:** Nested expressions that relate other group sets or group set relationship expressions.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                     | Description                                                                                                        |
| ----------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| [GroupSetRelationExpression](#specifications_items_planningData_groupSetRelations_items_expression_nestedRelationExpressions_items) | Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously. |

###### <a name="specifications_items_planningData_groupSetRelations_items_expression_nestedRelationExpressions_items"></a>3.1.2.10.1.3.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions > GroupSetRelationExpression

**Title:** GroupSetRelationExpression

|                           |                                                                                     |
| ------------------------- | ----------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                            |
| **Required**              | No                                                                                  |
| **Additional properties** | Not allowed                                                                         |
| **Same definition as**    | [expression](#specifications_items_planningData_groupSetRelations_items_expression) |

**Description:** Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.

##### <a name="specifications_items_planningData_courses"></a>3.1.2.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses`

**Title:** Courses

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Sets of courses.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                            | Description |
| ---------------------------------------------------------- | ----------- |
| [Course](#specifications_items_planningData_courses_items) | -           |

###### <a name="specifications_items_planningData_courses_items"></a>3.1.2.11.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course

**Title:** Course

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                             | Pattern | Type            | Deprecated | Definition | Title/Description                        |
| ------------------------------------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ---------------------------------------- |
| + [id](#specifications_items_planningData_courses_items_id )                         | No      | string          | No         | -          | Course identifier.                       |
| - [fullName](#specifications_items_planningData_courses_items_fullName )             | No      | string          | No         | -          | Full name of the course.                 |
| - [exKey](#specifications_items_planningData_courses_items_exKey )                   | No      | string          | No         | -          | External key of the course               |
| - [courseSubjects](#specifications_items_planningData_courses_items_courseSubjects ) | No      | array of object | No         | -          | List of subjects assigned to the course. |

###### <a name="specifications_items_planningData_courses_items_id"></a>3.1.2.11.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Course identifier.

###### <a name="specifications_items_planningData_courses_items_fullName"></a>3.1.2.11.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Full name of the course.

###### <a name="specifications_items_planningData_courses_items_exKey"></a>3.1.2.11.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the course

###### <a name="specifications_items_planningData_courses_items_courseSubjects"></a>3.1.2.11.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of subjects assigned to the course.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                        | Description |
| -------------------------------------------------------------------------------------- | ----------- |
| [CourseSubject](#specifications_items_planningData_courses_items_courseSubjects_items) | -           |

###### <a name="specifications_items_planningData_courses_items_courseSubjects_items"></a>3.1.2.11.1.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects > CourseSubject

**Title:** CourseSubject

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                          | Pattern | Type    | Deprecated | Definition | Title/Description                                                 |
| ------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------- |
| + [numHours](#specifications_items_planningData_courses_items_courseSubjects_items_numHours )     | No      | integer | No         | -          | Number of hours that this subject is taught. By default, it is 1. |
| + [refSubject](#specifications_items_planningData_courses_items_courseSubjects_items_refSubject ) | No      | string  | No         | -          | Subject of the course.                                            |

###### <a name="specifications_items_planningData_courses_items_courseSubjects_items_numHours"></a>3.1.2.11.1.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects > CourseSubject > numHours`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Number of hours that this subject is taught. By default, it is 1.

###### <a name="specifications_items_planningData_courses_items_courseSubjects_items_refSubject"></a>3.1.2.11.1.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > courses > Course > courseSubjects > CourseSubject > refSubject`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Subject of the course.

##### <a name="specifications_items_planningData_departments"></a>3.1.2.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments`

**Title:** Departments

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Sets of departments.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                    | Description |
| ------------------------------------------------------------------ | ----------- |
| [Department](#specifications_items_planningData_departments_items) | -           |

###### <a name="specifications_items_planningData_departments_items"></a>3.1.2.12.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department

**Title:** Department

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                           | Pattern | Type            | Deprecated | Definition | Title/Description                                                                                 |
| -------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_departments_items_id )                                   | No      | string          | No         | -          | Department identifier.                                                                            |
| - [fullName](#specifications_items_planningData_departments_items_fullName )                       | No      | string          | No         | -          | Full name of the department.                                                                      |
| - [messageToDepartment](#specifications_items_planningData_departments_items_messageToDepartment ) | No      | string          | No         | -          | Message that will be shown to the Department in the desiderata capture program.                   |
| - [isNew](#specifications_items_planningData_departments_items_isNew )                             | No      | boolean         | No         | -          | Boolean that indicates if the Department has been newly created in the desiderata capture module. |
| - [exKey](#specifications_items_planningData_departments_items_exKey )                             | No      | string          | No         | -          | Identifier of the Department in external application or academic manager.                         |
| - [email](#specifications_items_planningData_departments_items_email )                             | No      | string          | No         | -          | It is an email type that is associated with the Department                                        |
| - [refTeacher](#specifications_items_planningData_departments_items_refTeacher )                   | No      | array of string | No         | -          | Identifier of the list of teachers who are in this department                                     |
| - [refSubjects](#specifications_items_planningData_departments_items_refSubjects )                 | No      | array of string | No         | -          | Identifier of the list of subjects who are in this department                                     |

###### <a name="specifications_items_planningData_departments_items_id"></a>3.1.2.12.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Department identifier.

###### <a name="specifications_items_planningData_departments_items_fullName"></a>3.1.2.12.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Full name of the department.

###### <a name="specifications_items_planningData_departments_items_messageToDepartment"></a>3.1.2.12.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > messageToDepartment`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Message that will be shown to the Department in the desiderata capture program.

###### <a name="specifications_items_planningData_departments_items_isNew"></a>3.1.2.12.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > isNew`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Boolean that indicates if the Department has been newly created in the desiderata capture module.

###### <a name="specifications_items_planningData_departments_items_exKey"></a>3.1.2.12.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the Department in external application or academic manager.

###### <a name="specifications_items_planningData_departments_items_email"></a>3.1.2.12.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > email`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** It is an email type that is associated with the Department

###### <a name="specifications_items_planningData_departments_items_refTeacher"></a>3.1.2.12.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refTeacher`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Identifier of the list of teachers who are in this department

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                           | Description |
| ----------------------------------------------------------------------------------------- | ----------- |
| [refTeacher items](#specifications_items_planningData_departments_items_refTeacher_items) | -           |

###### <a name="specifications_items_planningData_departments_items_refTeacher_items"></a>3.1.2.12.1.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refTeacher > refTeacher items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

###### <a name="specifications_items_planningData_departments_items_refSubjects"></a>3.1.2.12.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refSubjects`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Identifier of the list of subjects who are in this department

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                             | Description |
| ------------------------------------------------------------------------------------------- | ----------- |
| [refSubjects items](#specifications_items_planningData_departments_items_refSubjects_items) | -           |

###### <a name="specifications_items_planningData_departments_items_refSubjects_items"></a>3.1.2.12.1.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > departments > Department > refSubjects > refSubjects items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

##### <a name="specifications_items_planningData_sessions"></a>3.1.2.13. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions`

**Title:** Sessions

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                              | Description |
| ------------------------------------------------------------ | ----------- |
| [Session](#specifications_items_planningData_sessions_items) | -           |

###### <a name="specifications_items_planningData_sessions_items"></a>3.1.2.13.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session

**Title:** Session

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                                                    | Pattern | Type            | Deprecated | Definition                      | Title/Description                                        |
| ----------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------- | -------------------------------------------------------- |
| + [id](#specifications_items_planningData_sessions_items_id )                                               | No      | integer         | No         | -                               | Session identifier.                                      |
| + [refFrame](#specifications_items_planningData_sessions_items_refFrame )                                   | No      | string          | No         | -                               | Session's frame identifier.                              |
| + [refMainTask](#specifications_items_planningData_sessions_items_refMainTask )                             | No      | string          | No         | -                               | RefMainTask                                              |
| + [refMainTeacher](#specifications_items_planningData_sessions_items_refMainTeacher )                       | No      | string          | No         | -                               | RefMainTeacher                                           |
| + [refMainSubject](#specifications_items_planningData_sessions_items_refMainSubject )                       | No      | string          | No         | -                               | RefMainSubject                                           |
| + [refMainGroup](#specifications_items_planningData_sessions_items_refMainGroup )                           | No      | object          | No         | In #/$defs/refGroup             | GroupReferenceType                                       |
| - [refColourInResult](#specifications_items_planningData_sessions_items_refColourInResult )                 | No      | string          | No         | -                               | RefColourInResult                                        |
| - [otherElementsInClassRooms](#specifications_items_planningData_sessions_items_otherElementsInClassRooms ) | No      | array of object | No         | -                               | OtherElementsInClassRoomsList                            |
| + [distribution](#specifications_items_planningData_sessions_items_distribution )                           | No      | object          | No         | In #/$defs/distribution         | Distribution                                             |
| + [sessionClassRooms](#specifications_items_planningData_sessions_items_sessionClassRooms )                 | No      | object          | No         | -                               | SessionClassRooms                                        |
| - [frameTemplate](#specifications_items_planningData_sessions_items_frameTemplate )                         | No      | array of object | No         | In #/$defs/sessionFrameTemplate | SessionFrameTemplate                                     |
| - [sessionSettings](#specifications_items_planningData_sessions_items_sessionSettings )                     | No      | object          | No         | -                               | SessionSettings                                          |
| - [sessionRelations](#specifications_items_planningData_sessions_items_sessionRelations )                   | No      | object          | No         | -                               | SessionRelations                                         |
| - [department](#specifications_items_planningData_sessions_items_department )                               | No      | string          | No         | -                               | Contains the reference of the department of the session. |

###### <a name="specifications_items_planningData_sessions_items_id"></a>3.1.2.13.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_refFrame"></a>3.1.2.13.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

###### <a name="specifications_items_planningData_sessions_items_refMainTask"></a>3.1.2.13.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainTask`

**Title:** RefMainTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Main Task identifier.

###### <a name="specifications_items_planningData_sessions_items_refMainTeacher"></a>3.1.2.13.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainTeacher`

**Title:** RefMainTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Main Teacher identifier.

###### <a name="specifications_items_planningData_sessions_items_refMainSubject"></a>3.1.2.13.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainSubject`

**Title:** RefMainSubject

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the main subject.

###### <a name="specifications_items_planningData_sessions_items_refMainGroup"></a>3.1.2.13.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainGroup`

**Title:** GroupReferenceType

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | Yes              |
| **Additional properties** | Any type allowed |
| **Defined in**            | #/$defs/refGroup |

**Description:** Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

| Property                                                                                     | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                    |
| -------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| + [refIdGroup](#specifications_items_planningData_sessions_items_refMainGroup_refIdGroup )   | No      | string  | No         | -          | Group identifier.                                                                                                                    |
| - [numStudents](#specifications_items_planningData_sessions_items_refMainGroup_numStudents ) | No      | integer | No         | -          | Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object. |

###### <a name="specifications_items_planningData_sessions_items_refMainGroup_refIdGroup"></a>3.1.2.13.1.6.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainGroup > refIdGroup`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group identifier.

###### <a name="specifications_items_planningData_sessions_items_refMainGroup_numStudents"></a>3.1.2.13.1.6.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refMainGroup > numStudents`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.

###### <a name="specifications_items_planningData_sessions_items_refColourInResult"></a>3.1.2.13.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > refColourInResult`

**Title:** RefColourInResult

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the session in the result.

###### <a name="specifications_items_planningData_sessions_items_otherElementsInClassRooms"></a>3.1.2.13.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms`

**Title:** OtherElementsInClassRoomsList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of other time elements in the classroom related to each other.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                | Description                                                                                     |
| -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| [OtherElementsInClassRooms](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items) | It contains interrelated elements that are present in the session in addition to the main ones. |

###### <a name="specifications_items_planningData_sessions_items_otherElementsInClassRooms_items"></a>3.1.2.13.1.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms

**Title:** OtherElementsInClassRooms

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** It contains interrelated elements that are present in the session in addition to the main ones.

| Property                                                                                                      | Pattern | Type   | Deprecated | Definition                                                                              | Title/Description  |
| ------------------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | --------------------------------------------------------------------------------------- | ------------------ |
| - [refSubject](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refSubject ) | No      | string | No         | -                                                                                       | SubjectReference   |
| - [refTeacher](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refTeacher ) | No      | string | No         | -                                                                                       | TeacherReference   |
| - [refGroup](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refGroup )     | No      | object | No         | Same as [refMainGroup](#specifications_items_planningData_sessions_items_refMainGroup ) | GroupReferenceType |
| - [refTask](#specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refTask )       | No      | string | No         | -                                                                                       | TaskReference      |

###### <a name="specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refSubject"></a>3.1.2.13.1.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refSubject`

**Title:** SubjectReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of other subject in the classroom.

###### <a name="specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refTeacher"></a>3.1.2.13.1.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTeacher`

**Title:** TeacherReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of other teacher in the classroom.

###### <a name="specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refGroup"></a>3.1.2.13.1.8.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refGroup`

**Title:** GroupReferenceType

|                           |                                                                                |
| ------------------------- | ------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                       |
| **Required**              | No                                                                             |
| **Additional properties** | Any type allowed                                                               |
| **Same definition as**    | [refMainGroup](#specifications_items_planningData_sessions_items_refMainGroup) |

**Description:** Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

###### <a name="specifications_items_planningData_sessions_items_otherElementsInClassRooms_items_refTask"></a>3.1.2.13.1.8.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTask`

**Title:** TaskReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of the task of the other teacher.

###### <a name="specifications_items_planningData_sessions_items_distribution"></a>3.1.2.13.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution`

**Title:** Distribution

|                           |                      |
| ------------------------- | -------------------- |
| **Type**                  | `object`             |
| **Required**              | Yes                  |
| **Additional properties** | Not allowed          |
| **Defined in**            | #/$defs/distribution |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

| Property                                                                                             | Pattern | Type            | Deprecated | Definition | Title/Description |
| ---------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [periods](#specifications_items_planningData_sessions_items_distribution_periods )                 | No      | array of string | No         | -          | RefPeriods        |
| - [stablePeriods](#specifications_items_planningData_sessions_items_distribution_stablePeriods )     | No      | object          | No         | -          | StablePeriods     |
| - [variablePeriods](#specifications_items_planningData_sessions_items_distribution_variablePeriods ) | No      | object          | No         | -          | VariablePeriods   |

###### <a name="specifications_items_planningData_sessions_items_distribution_periods"></a>3.1.2.13.1.9.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > periods`

**Title:** RefPeriods

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of periods or weeks in which the class unit must be assigned.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                           | Description        |
| ----------------------------------------------------------------------------------------- | ------------------ |
| [RefPeriod](#specifications_items_planningData_sessions_items_distribution_periods_items) | Period identifier. |

###### <a name="specifications_items_planningData_sessions_items_distribution_periods_items"></a>3.1.2.13.1.9.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > periods > RefPeriod

**Title:** RefPeriod

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Period identifier.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods"></a>3.1.2.13.1.9.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods`

**Title:** StablePeriods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** The allocation of the class unit of the session is the same in each period.

| Property                                                                                                             | Pattern | Type             | Deprecated | Definition                | Title/Description |
| -------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------- | ----------------- |
| - [stableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming )         | No      | array of integer | No         | In #/$defs/stableTiming   | StableTiming      |
| - [variableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming )     | No      | object           | No         | In #/$defs/variableTiming | VariableTiming    |
| - [stableTimingList](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTimingList ) | No      | array            | No         | -                         | StableTimingList  |

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming"></a>3.1.2.13.1.9.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTiming`

**Title:** StableTiming

|                |                      |
| -------------- | -------------------- |
| **Type**       | `array of integer`   |
| **Required**   | No                   |
| **Defined in** | #/$defs/stableTiming |

**Description:** It contains the fixed way of allocating time across the days of the period.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                 | Description                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------- |
| [DailyMinutes](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming_items) | Indicates the number of minutes to be allocated on a given day. |

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming_items"></a>3.1.2.13.1.9.2.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTiming > DailyMinutes

**Title:** DailyMinutes

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the number of minutes to be allocated on a given day.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming"></a>3.1.2.13.1.9.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming`

**Title:** VariableTiming

|                           |                        |
| ------------------------- | ---------------------- |
| **Type**                  | `object`               |
| **Required**              | No                     |
| **Additional properties** | Not allowed            |
| **Defined in**            | #/$defs/variableTiming |

**Description:** It defines the allocating time as a total of time, maximum and minimun range of sections per day.

| Property                                                                                                                                | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------- |
| + [minutesAmount](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_minutesAmount )           | No      | integer | No         | -          | Total of session's minutes.                                                                                                       |
| + [maxMinutesDaily](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily )       | No      | integer | No         | -          | Maximum of minutes per day.                                                                                                       |
| - [minMinutesDaily](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily )       | No      | integer | No         | -          | Minimun of minutes per day.                                                                                                       |
| - [avoidMaxDuration](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration )     | No      | boolean | No         | -          | It indicates the preference for class units of maximum duration.                                                                  |
| - [avoidMinDuration](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration )     | No      | boolean | No         | -          | It indicates the preference for class units of minimun duration.                                                                  |
| - [allowDiscontinuity](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity ) | No      | boolean | No         | -          | It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them. |

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_minutesAmount"></a>3.1.2.13.1.9.2.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minutesAmount`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Total of session's minutes.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily"></a>3.1.2.13.1.9.2.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > maxMinutesDaily`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Maximum of minutes per day.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily"></a>3.1.2.13.1.9.2.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minMinutesDaily`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Minimun of minutes per day.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration"></a>3.1.2.13.1.9.2.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMaxDuration`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates the preference for class units of maximum duration.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration"></a>3.1.2.13.1.9.2.2.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMinDuration`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates the preference for class units of minimun duration.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity"></a>3.1.2.13.1.9.2.2.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > variableTiming > allowDiscontinuity`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTimingList"></a>3.1.2.13.1.9.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTimingList`

**Title:** StableTimingList

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | No      |

**Description:** It contains an array of 'StableTiming' distributions.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                     | Description                                                                 |
| ------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| [StableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTimingList_items) | It contains the fixed way of allocating time across the days of the period. |

###### <a name="specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTimingList_items"></a>3.1.2.13.1.9.2.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > stablePeriods > stableTimingList > StableTiming

**Title:** StableTiming

|                        |                                                                                                           |
| ---------------------- | --------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of integer`                                                                                        |
| **Required**           | No                                                                                                        |
| **Same definition as** | [stableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming) |

**Description:** It contains the fixed way of allocating time across the days of the period.

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods"></a>3.1.2.13.1.9.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods`

**Title:** VariablePeriods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** The total of the class units of the distribution are allocation between the periods.

| Property                                                                                                                       | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [timing](#specifications_items_planningData_sessions_items_distribution_variablePeriods_timing )                             | No      | object  | No         | -          | TimeAllocation                                                                                                                                                                                                                                                                            |
| - [maximunTimeInPeriod](#specifications_items_planningData_sessions_items_distribution_variablePeriods_maximunTimeInPeriod )   | No      | integer | No         | -          | Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.                                                                                                                                                                |
| - [minimnunTimeInPeriod](#specifications_items_planningData_sessions_items_distribution_variablePeriods_minimnunTimeInPeriod ) | No      | integer | No         | -          | Minimum number of minutes to be allocated in each Period.                                                                                                                                                                                                                                 |
| - [maximumTimeframe](#specifications_items_planningData_sessions_items_distribution_variablePeriods_maximumTimeframe )         | No      | integer | No         | -          | Indicates the maximum interval of periods that can be used to assign the session, counting from the first period with a session assignment to the last period with a session assignment. That is, the periods in between are also considered even if they do not have a session assigned. |

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods_timing"></a>3.1.2.13.1.9.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > timing`

**Title:** TimeAllocation

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | Yes              |
| **Additional properties** | Any type allowed |

**Description:** Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.

| Property                                                                                                                  | Pattern | Type             | Deprecated | Definition                                                                                                             | Title/Description |
| ------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------------------------------------- | ----------------- |
| - [stableTiming](#specifications_items_planningData_sessions_items_distribution_variablePeriods_timing_stableTiming )     | No      | array of integer | No         | Same as [stableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming )     | StableTiming      |
| - [variableTiming](#specifications_items_planningData_sessions_items_distribution_variablePeriods_timing_variableTiming ) | No      | object           | No         | Same as [variableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming ) | VariableTiming    |

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods_timing_stableTiming"></a>3.1.2.13.1.9.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > timing > stableTiming`

**Title:** StableTiming

|                        |                                                                                                           |
| ---------------------- | --------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of integer`                                                                                        |
| **Required**           | No                                                                                                        |
| **Same definition as** | [stableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_stableTiming) |

**Description:** It contains the fixed way of allocating time across the days of the period.

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods_timing_variableTiming"></a>3.1.2.13.1.9.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > timing > variableTiming`

**Title:** VariableTiming

|                           |                                                                                                               |
| ------------------------- | ------------------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                                      |
| **Required**              | No                                                                                                            |
| **Additional properties** | Not allowed                                                                                                   |
| **Same definition as**    | [variableTiming](#specifications_items_planningData_sessions_items_distribution_stablePeriods_variableTiming) |

**Description:** It defines the allocating time as a total of time, maximum and minimun range of sections per day.

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods_maximunTimeInPeriod"></a>3.1.2.13.1.9.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > maximunTimeInPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods_minimnunTimeInPeriod"></a>3.1.2.13.1.9.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > minimnunTimeInPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Minimum number of minutes to be allocated in each Period.

###### <a name="specifications_items_planningData_sessions_items_distribution_variablePeriods_maximumTimeframe"></a>3.1.2.13.1.9.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > distribution > variablePeriods > maximumTimeframe`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the maximum interval of periods that can be used to assign the session, counting from the first period with a session assignment to the last period with a session assignment. That is, the periods in between are also considered even if they do not have a session assigned.

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms"></a>3.1.2.13.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms`

**Title:** SessionClassRooms

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** It contains the information about the classrooms for the class units. At least one classroom is required for the class units.

| Property                                                                                                          | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| + [classRoomsToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign )   | No      | array            | No         | -          | ClassRoomsToAssign                                                                                                                      |
| - [capacityPreference](#specifications_items_planningData_sessions_items_sessionClassRooms_capacityPreference )   | No      | enum (of string) | No         | -          | Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.                               |
| - [capacityType](#specifications_items_planningData_sessions_items_sessionClassRooms_capacityType )               | No      | enum (of string) | No         | -          | It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.                  |
| - [alwaysSameClassRoom](#specifications_items_planningData_sessions_items_sessionClassRooms_alwaysSameClassRoom ) | No      | boolean          | No         | -          | Indicates if the session must be always in the same classroom the hole week or it can be given on different classrooms during the week. |

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign"></a>3.1.2.13.1.10.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign`

**Title:** ClassRoomsToAssign

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | Yes     |

**Description:** List of classrooms to the session. Each object in the list represent one classroom that must be assigned.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                      | Description                                                                                                                   |
| -------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| [RefClassRoomToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items) | Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session. |

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items"></a>3.1.2.13.1.10.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign

**Title:** RefClassRoomToAssign

|                           |                              |
| ------------------------- | ---------------------------- |
| **Type**                  | `object`                     |
| **Required**              | No                           |
| **Additional properties** | Not allowed                  |
| **Defined in**            | #/$defs/refClassRoomToAssign |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

| Property                                                                                                                                 | Pattern | Type            | Deprecated | Definition | Title/Description  |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------ |
| - [classRoom](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom )                   | No      | string          | No         | -          | ClassRoomRef       |
| - [classRoomsSetsList](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList ) | No      | array of string | No         | -          | ClassRoomsSetsList |

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom"></a>3.1.2.13.1.10.1.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoom`

**Title:** ClassRoomRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList"></a>3.1.2.13.1.10.1.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList`

**Title:** ClassRoomsSetsList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Classroom set list where one classroom could be taken to assign to session.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                          | Description               |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items) | Classroom set identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items"></a>3.1.2.13.1.10.1.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_capacityPreference"></a>3.1.2.13.1.10.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > capacityPreference`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"ignore"`         |

**Description:** Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.

Must be one of:
* "attempt"
* "strict"
* "ignore"

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_capacityType"></a>3.1.2.13.1.10.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > capacityType`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"individual"`     |

**Description:** It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.

Must be one of:
* "individual"
* "collective"

###### <a name="specifications_items_planningData_sessions_items_sessionClassRooms_alwaysSameClassRoom"></a>3.1.2.13.1.10.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionClassRooms > alwaysSameClassRoom`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if the session must be always in the same classroom the hole week or it can be given on different classrooms during the week.

###### <a name="specifications_items_planningData_sessions_items_frameTemplate"></a>3.1.2.13.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate`

**Title:** SessionFrameTemplate

|                |                              |
| -------------- | ---------------------------- |
| **Type**       | `array of object`            |
| **Required**   | No                           |
| **Defined in** | #/$defs/sessionFrameTemplate |

**Description:** Complete template of preferences.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                   | Description                    |
| ------------------------------------------------------------------------------------------------- | ------------------------------ |
| [SessionSectionPreference](#specifications_items_planningData_sessions_items_frameTemplate_items) | Section assignment preference. |

###### <a name="specifications_items_planningData_sessions_items_frameTemplate_items"></a>3.1.2.13.1.11.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference

**Title:** SessionSectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Section assignment preference.

| Property                                                                                | Pattern | Type             | Deprecated | Definition | Title/Description                                      |
| --------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------ |
| + [day](#specifications_items_planningData_sessions_items_frameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when the section is located.           |
| + [index](#specifications_items_planningData_sessions_items_frameTemplate_items_index ) | No      | integer          | No         | -          | Index built into the day where the section is located. |
| + [frame](#specifications_items_planningData_sessions_items_frameTemplate_items_frame ) | No      | string           | No         | -          | Frame identifier.                                      |
| + [type](#specifications_items_planningData_sessions_items_frameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeWithPreset                        |

###### <a name="specifications_items_planningData_sessions_items_frameTemplate_items_day"></a>3.1.2.13.1.11.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="specifications_items_planningData_sessions_items_frameTemplate_items_index"></a>3.1.2.13.1.11.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="specifications_items_planningData_sessions_items_frameTemplate_items_frame"></a>3.1.2.13.1.11.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

###### <a name="specifications_items_planningData_sessions_items_frameTemplate_items_type"></a>3.1.2.13.1.11.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > frameTemplate > SessionSectionPreference > type`

**Title:** SectionPreferenceTypeWithPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Session availability to be assigned to the section.

Must be one of:
* "banned"
* "strong-non-preferred"
* "weak-non-preferred"
* "preset"

###### <a name="specifications_items_planningData_sessions_items_sessionSettings"></a>3.1.2.13.1.12. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings`

**Title:** SessionSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Conditions on the position of the class unit.

| Property                                                                                                                                                | Pattern | Type             | Deprecated | Definition                         | Title/Description                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| - [avoidFirstHourSessions](#specifications_items_planningData_sessions_items_sessionSettings_avoidFirstHourSessions )                                   | No      | boolean          | No         | -                                  | It penalises the position of the class units if more than 50% of the class units are at first hour.            |
| - [avoidLastHourSessions](#specifications_items_planningData_sessions_items_sessionSettings_avoidLastHourSessions )                                     | No      | boolean          | No         | -                                  | It penalises the position of the class units if more than 50% of the class units are at last hour.             |
| - [avoidAssingLastHourAndFirstNextDay](#specifications_items_planningData_sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay )           | No      | boolean          | No         | -                                  | It penalises if the last hour and the first hour of the following day match.                                   |
| - [sameHourPreference](#specifications_items_planningData_sessions_items_sessionSettings_sameHourPreference )                                           | No      | enum (of string) | No         | -                                  | Preference over class units that coincide in the same time slot.                                               |
| - [avoidAfternoonSessions](#specifications_items_planningData_sessions_items_sessionSettings_avoidAfternoonSessions )                                   | No      | boolean          | No         | -                                  | It penalises if there is more than one class unit after noon stop..                                            |
| - [avoidAfterBreakSessions](#specifications_items_planningData_sessions_items_sessionSettings_avoidAfterBreakSessions )                                 | No      | boolean          | No         | -                                  | It penalises if more than 50% of the class unit are after the last break of the day.                           |
| - [nonBreakInTheMiddleOfConsecutiveSession](#specifications_items_planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession ) | No      | boolean          | No         | -                                  | Do not allow breaks between consecutive class units (class duration of more than one section).                 |
| - [nonBreakInTheMiddleOfSession](#specifications_items_planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfSession )                       | No      | boolean          | No         | -                                  | Do not allow breaks between class units of multiple duration (class duration of more than one section).        |
| - [followedDaysPreference](#specifications_items_planningData_sessions_items_sessionSettings_followedDaysPreference )                                   | No      | enum (of string) | No         | -                                  | If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.    |
| - [consecutiveWeeksBorders](#specifications_items_planningData_sessions_items_sessionSettings_consecutiveWeeksBorders )                                 | No      | boolean          | No         | -                                  | It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'. |
| - [samePositionEveryPeriod](#specifications_items_planningData_sessions_items_sessionSettings_samePositionEveryPeriod )                                 | No      | enum (of string) | No         | In #/$defs/samePositionEveryPeriod | SamePositionEveryPeriod                                                                                        |

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_avoidFirstHourSessions"></a>3.1.2.13.1.12.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidFirstHourSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises the position of the class units if more than 50% of the class units are at first hour.

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_avoidLastHourSessions"></a>3.1.2.13.1.12.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidLastHourSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises the position of the class units if more than 50% of the class units are at last hour.

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay"></a>3.1.2.13.1.12.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidAssingLastHourAndFirstNextDay`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if the last hour and the first hour of the following day match.

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_sameHourPreference"></a>3.1.2.13.1.12.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > sameHourPreference`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"ignore"`         |

**Description:** Preference over class units that coincide in the same time slot.

Must be one of:
* "ignore"
* "avoid"
* "same"

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_avoidAfternoonSessions"></a>3.1.2.13.1.12.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidAfternoonSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if there is more than one class unit after noon stop..

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_avoidAfterBreakSessions"></a>3.1.2.13.1.12.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > avoidAfterBreakSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if more than 50% of the class unit are after the last break of the day.

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession"></a>3.1.2.13.1.12.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfConsecutiveSession`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** Do not allow breaks between consecutive class units (class duration of more than one section).

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfSession"></a>3.1.2.13.1.12.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfSession`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Do not allow breaks between class units of multiple duration (class duration of more than one section).

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_followedDaysPreference"></a>3.1.2.13.1.12.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > followedDaysPreference`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"ignore"`         |

**Description:** If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.

Must be one of:
* "ignore"
* "attempt"
* "avoid"
* "strict"
* "forbidden"

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_consecutiveWeeksBorders"></a>3.1.2.13.1.12.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > consecutiveWeeksBorders`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.

###### <a name="specifications_items_planningData_sessions_items_sessionSettings_samePositionEveryPeriod"></a>3.1.2.13.1.12.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionSettings > samePositionEveryPeriod`

**Title:** SamePositionEveryPeriod

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `enum (of string)`              |
| **Required**   | No                              |
| **Default**    | `"ignore"`                      |
| **Defined in** | #/$defs/samePositionEveryPeriod |

**Description:** Keep the same position every week or period for the class units.

Must be one of:
* "ignore"
* "attempt"
* "avoid"
* "strict"
* "forbidden"

###### <a name="specifications_items_planningData_sessions_items_sessionRelations"></a>3.1.2.13.1.13. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations`

**Title:** SessionRelations

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.

| Property                                                                                                               | Pattern | Type             | Deprecated | Definition | Title/Description      |
| ---------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ---------------------- |
| - [refSimultaneusGroup](#specifications_items_planningData_sessions_items_sessionRelations_refSimultaneusGroup )       | No      | integer          | No         | -          | RefSimultaneusGroup    |
| - [differentDays](#specifications_items_planningData_sessions_items_sessionRelations_differentDays )                   | No      | object           | No         | -          | DifferentDays          |
| - [consecutiveGroup](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup )             | No      | object           | No         | -          | ConsecutiveGroup       |
| - [nonConsecutiveSessions](#specifications_items_planningData_sessions_items_sessionRelations_nonConsecutiveSessions ) | No      | array of integer | No         | -          | NonConsecutiveSessions |
| - [nonSimultaneus](#specifications_items_planningData_sessions_items_sessionRelations_nonSimultaneus )                 | No      | array of integer | No         | -          | NonSimultaneus         |
| - [previousTo](#specifications_items_planningData_sessions_items_sessionRelations_previousTo )                         | No      | array of integer | No         | -          | PreviousTo             |
| - [afterTo](#specifications_items_planningData_sessions_items_sessionRelations_afterTo )                               | No      | array of integer | No         | -          | AfterTo                |
| - [maximumSeparationTo](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo )       | No      | array of object  | No         | -          | MaximumSeparationTo    |
| - [minimumSeparationTo](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo )       | No      | array of object  | No         | -          | MinimumSeparationTo    |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_refSimultaneusGroup"></a>3.1.2.13.1.13.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > refSimultaneusGroup`

**Title:** RefSimultaneusGroup

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_differentDays"></a>3.1.2.13.1.13.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays`

**Title:** DifferentDays

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Conditions on this and another class unit cannot coincide on the same day.

| Property                                                                                                       | Pattern | Type             | Deprecated | Definition | Title/Description                                               |
| -------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------- |
| + [refSesions](#specifications_items_planningData_sessions_items_sessionRelations_differentDays_refSesions )   | No      | array of integer | No         | -          | RefSesions                                                      |
| - [daysSetting](#specifications_items_planningData_sessions_items_sessionRelations_differentDays_daysSetting ) | No      | enum (of string) | No         | -          | Keep the same position each week or period for the class units. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_differentDays_refSesions"></a>3.1.2.13.1.13.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays > refSesions`

**Title:** RefSesions

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:**  Sessions identifiers which class units should not be assigned on the same day.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                 | Description         |
| --------------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_differentDays_refSesions_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_differentDays_refSesions_items"></a>3.1.2.13.1.13.2.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays > refSesions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_differentDays_daysSetting"></a>3.1.2.13.1.13.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > differentDays > daysSetting`

|              |                              |
| ------------ | ---------------------------- |
| **Type**     | `enum (of string)`           |
| **Required** | No                           |
| **Default**  | `"indifferentDaysPreferred"` |

**Description:** Keep the same position each week or period for the class units.

Must be one of:
* "nonConsecutiveDaysPreferred"
* "indifferentDaysPreferred"
* "strictNonConsecutiveDays"
* "strictConsecutiveDays"

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup"></a>3.1.2.13.1.13.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup`

**Title:** ConsecutiveGroup

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Contains the references of a continuous sessions group.

| Property                                                                                                                                      | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                          |
| --------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| + [id](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_id )                                               | No      | integer          | No         | -          | Continuous sessions group identifier.                                                                                                      |
| + [refSessions](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions )                             | No      | array of integer | No         | -          | SessionRefs                                                                                                                                |
| - [order](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_order )                                         | No      | enum (of string) | No         | -          | Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day). |
| - [allowBreakBetweenSessions](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions ) | No      | boolean          | No         | -          | Indicates if break between sessions is allowed to keep the relation.                                                                       |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_id"></a>3.1.2.13.1.13.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Continuous sessions group identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions"></a>3.1.2.13.1.13.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions`

**Title:** SessionRefs

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:** List of the consecutive sessions. Must contain the sesion itself and the proper order of continuity (see 'order' property).

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                     | Description         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions_items"></a>3.1.2.13.1.13.3.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_order"></a>3.1.2.13.1.13.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > order`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"unordered"`      |

**Description:** Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).

Must be one of:
* "unordered"
* "ordered"
* "sameDay"

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions"></a>3.1.2.13.1.13.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > consecutiveGroup > allowBreakBetweenSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if break between sessions is allowed to keep the relation.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_nonConsecutiveSessions"></a>3.1.2.13.1.13.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions`

**Title:** NonConsecutiveSessions

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** Identifiers of the sessions which class units must not be consecutive. This is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                               | Description         |
| ------------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_nonConsecutiveSessions_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_nonConsecutiveSessions_items"></a>3.1.2.13.1.13.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_nonSimultaneus"></a>3.1.2.13.1.13.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonSimultaneus`

**Title:** NonSimultaneus

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                       | Description         |
| ----------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_nonSimultaneus_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_nonSimultaneus_items"></a>3.1.2.13.1.13.5.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > nonSimultaneus > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_previousTo"></a>3.1.2.13.1.13.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > previousTo`

**Title:** PreviousTo

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                   | Description         |
| ------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_previousTo_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_previousTo_items"></a>3.1.2.13.1.13.6.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > previousTo > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_afterTo"></a>3.1.2.13.1.13.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > afterTo`

**Title:** AfterTo

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                | Description         |
| ---------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_afterTo_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_afterTo_items"></a>3.1.2.13.1.13.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > afterTo > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo"></a>3.1.2.13.1.13.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo`

**Title:** MaximumSeparationTo

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains class units to be taught within a maximum number of days of the current class units.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                            | Description                                                                                                           |
| -------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| [MaximumSeparationToSession](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items) | It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items"></a>3.1.2.13.1.13.8.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession

**Title:** MaximumSeparationToSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days.

| Property                                                                                                                   | Pattern | Type             | Deprecated | Definition | Title/Description             |
| -------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ----------------------------- |
| + [refSessions](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions ) | No      | array of integer | No         | -          | SessionRefs                   |
| + [days](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_days )               | No      | integer          | No         | -          | Days of separation condition. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions"></a>3.1.2.13.1.13.8.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions`

**Title:** SessionRefs

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:** List of sessions references.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                              | Description         |
| ---------------------------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items"></a>3.1.2.13.1.13.8.1.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_maximumSeparationTo_items_days"></a>3.1.2.13.1.13.8.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > days`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Days of separation condition.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo"></a>3.1.2.13.1.13.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo`

**Title:** MinimumSeparationTo

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains class units that must be taught at least a minimum number of days apart from the current class unit. .

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                            | Description                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| [MinimumSeparationToSession](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items) | It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items"></a>3.1.2.13.1.13.9.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession

**Title:** MinimumSeparationToSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days.

| Property                                                                                                                   | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                       |
| -------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------- |
| + [refSessions](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions ) | No      | array of integer | No         | -          | SessionRefs                                                                                             |
| + [days](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_days )               | No      | integer          | No         | -          | Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions"></a>3.1.2.13.1.13.9.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions`

**Title:** SessionRefs

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:** List of sessions references.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                              | Description         |
| ---------------------------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items) | Session identifier. |

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items"></a>3.1.2.13.1.13.9.1.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_sessions_items_sessionRelations_minimumSeparationTo_items_days"></a>3.1.2.13.1.13.9.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > days`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'.

###### <a name="specifications_items_planningData_sessions_items_department"></a>3.1.2.13.1.14. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > sessions > Session > department`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Contains the reference of the department of the session.

##### <a name="specifications_items_planningData_meetings"></a>3.1.2.14. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings`

**Title:** Meetings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of meetings between teachers defined in the timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                              | Description                         |
| ------------------------------------------------------------ | ----------------------------------- |
| [Meeting](#specifications_items_planningData_meetings_items) | Sevice of meeting between teachers. |

###### <a name="specifications_items_planningData_meetings_items"></a>3.1.2.14.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting

**Title:** Meeting

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Sevice of meeting between teachers.

| Property                                                                                          | Pattern | Type            | Deprecated | Definition                                                                                                                    | Title/Description                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_meetings_items_id )                                     | No      | string          | No         | -                                                                                                                             | Session identifier.                                                                                                                                                                               |
| + [refFrame](#specifications_items_planningData_meetings_items_refFrame )                         | No      | string          | No         | -                                                                                                                             | Session's frame identifier.                                                                                                                                                                       |
| + [refTask](#specifications_items_planningData_meetings_items_refTask )                           | No      | string          | No         | -                                                                                                                             | RefTask                                                                                                                                                                                           |
| + [refTeachers](#specifications_items_planningData_meetings_items_refTeachers )                   | No      | array of string | No         | -                                                                                                                             | RefTeachers                                                                                                                                                                                       |
| - [refColourInResult](#specifications_items_planningData_meetings_items_refColourInResult )       | No      | string          | No         | -                                                                                                                             | Colour code used to represent the meeting in the result.                                                                                                                                          |
| + [distribution](#specifications_items_planningData_meetings_items_distribution )                 | No      | object          | No         | Same as [distribution](#specifications_items_planningData_sessions_items_distribution )                                       | Distribution                                                                                                                                                                                      |
| - [frameTemplate](#specifications_items_planningData_meetings_items_frameTemplate )               | No      | array of object | No         | Same as [frameTemplate](#specifications_items_planningData_sessions_items_frameTemplate )                                     | SessionFrameTemplate                                                                                                                                                                              |
| - [refClassRoomToAssign](#specifications_items_planningData_meetings_items_refClassRoomToAssign ) | No      | object          | No         | Same as [RefClassRoomToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items ) | RefClassRoomToAssign                                                                                                                                                                              |
| - [refBuilding](#specifications_items_planningData_meetings_items_refBuilding )                   | No      | string          | No         | -                                                                                                                             | Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom. |
| - [settings](#specifications_items_planningData_meetings_items_settings )                         | No      | object          | No         | In #/$defs/nonClassSessionSettings                                                                                            | NonClassSessionSettings                                                                                                                                                                           |

###### <a name="specifications_items_planningData_meetings_items_id"></a>3.1.2.14.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_meetings_items_refFrame"></a>3.1.2.14.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

###### <a name="specifications_items_planningData_meetings_items_refTask"></a>3.1.2.14.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refTask`

**Title:** RefTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

###### <a name="specifications_items_planningData_meetings_items_refTeachers"></a>3.1.2.14.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refTeachers`

**Title:** RefTeachers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** List of teachers who in the service.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                   | Description         |
| --------------------------------------------------------------------------------- | ------------------- |
| [RefTeacher](#specifications_items_planningData_meetings_items_refTeachers_items) | Teacher identifier. |

###### <a name="specifications_items_planningData_meetings_items_refTeachers_items"></a>3.1.2.14.1.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refTeachers > RefTeacher

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Teacher identifier.

###### <a name="specifications_items_planningData_meetings_items_refColourInResult"></a>3.1.2.14.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the meeting in the result.

###### <a name="specifications_items_planningData_meetings_items_distribution"></a>3.1.2.14.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > distribution`

**Title:** Distribution

|                           |                                                                                |
| ------------------------- | ------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                       |
| **Required**              | Yes                                                                            |
| **Additional properties** | Not allowed                                                                    |
| **Same definition as**    | [distribution](#specifications_items_planningData_sessions_items_distribution) |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

###### <a name="specifications_items_planningData_meetings_items_frameTemplate"></a>3.1.2.14.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > frameTemplate`

**Title:** SessionFrameTemplate

|                        |                                                                                  |
| ---------------------- | -------------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                                |
| **Required**           | No                                                                               |
| **Same definition as** | [frameTemplate](#specifications_items_planningData_sessions_items_frameTemplate) |

**Description:** Complete template of preferences.

###### <a name="specifications_items_planningData_meetings_items_refClassRoomToAssign"></a>3.1.2.14.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refClassRoomToAssign`

**Title:** RefClassRoomToAssign

|                           |                                                                                                                      |
| ------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                                             |
| **Required**              | No                                                                                                                   |
| **Additional properties** | Not allowed                                                                                                          |
| **Same definition as**    | [RefClassRoomToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items) |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

###### <a name="specifications_items_planningData_meetings_items_refBuilding"></a>3.1.2.14.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

###### <a name="specifications_items_planningData_meetings_items_settings"></a>3.1.2.14.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > settings`

**Title:** NonClassSessionSettings

|                           |                                 |
| ------------------------- | ------------------------------- |
| **Type**                  | `object`                        |
| **Required**              | No                              |
| **Additional properties** | Not allowed                     |
| **Defined in**            | #/$defs/nonClassSessionSettings |

**Description:** Settings of the meeting.

| Property                                                                                                             | Pattern | Type             | Deprecated | Definition                                                                                                                    | Title/Description                                                                                                                                           |
| -------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [computeForMaxMinOccupancy](#specifications_items_planningData_meetings_items_settings_computeForMaxMinOccupancy ) | No      | boolean          | No         | -                                                                                                                             |  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students. |
| - [samePositionEveryPeriod](#specifications_items_planningData_meetings_items_settings_samePositionEveryPeriod )     | No      | enum (of string) | No         | Same as [samePositionEveryPeriod](#specifications_items_planningData_sessions_items_sessionSettings_samePositionEveryPeriod ) | SamePositionEveryPeriod                                                                                                                                     |

###### <a name="specifications_items_planningData_meetings_items_settings_computeForMaxMinOccupancy"></a>3.1.2.14.1.10.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > settings > computeForMaxMinOccupancy`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:**  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.

###### <a name="specifications_items_planningData_meetings_items_settings_samePositionEveryPeriod"></a>3.1.2.14.1.10.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > meetings > Meeting > settings > samePositionEveryPeriod`

**Title:** SamePositionEveryPeriod

|                        |                                                                                                                      |
| ---------------------- | -------------------------------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                                                   |
| **Required**           | No                                                                                                                   |
| **Default**            | `"ignore"`                                                                                                           |
| **Same definition as** | [samePositionEveryPeriod](#specifications_items_planningData_sessions_items_sessionSettings_samePositionEveryPeriod) |

**Description:** Keep the same position every week or period for the class units.

##### <a name="specifications_items_planningData_complementaryActivities"></a>3.1.2.15. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities`

**Title:** ComplementaryActivities

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of complementary activities of the teachers.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                   | Description                                  |
| --------------------------------------------------------------------------------- | -------------------------------------------- |
| [Complementary](#specifications_items_planningData_complementaryActivities_items) | Service of teacher's complementary activity. |

###### <a name="specifications_items_planningData_complementaryActivities_items"></a>3.1.2.15.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary

**Title:** Complementary

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Service of teacher`s complementary activity.

| Property                                                                                                         | Pattern | Type            | Deprecated | Definition                                                                                                                    | Title/Description                                                                                                                                                                                 |
| ---------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_complementaryActivities_items_id )                                     | No      | integer         | No         | -                                                                                                                             | Session identifier.                                                                                                                                                                               |
| + [refFrame](#specifications_items_planningData_complementaryActivities_items_refFrame )                         | No      | string          | No         | -                                                                                                                             | Session's frame identifier.                                                                                                                                                                       |
| + [refTask](#specifications_items_planningData_complementaryActivities_items_refTask )                           | No      | string          | No         | -                                                                                                                             | RefTask                                                                                                                                                                                           |
| + [refTeacher](#specifications_items_planningData_complementaryActivities_items_refTeacher )                     | No      | string          | No         | -                                                                                                                             | RefTeacher                                                                                                                                                                                        |
| - [refColourInResult](#specifications_items_planningData_complementaryActivities_items_refColourInResult )       | No      | string          | No         | -                                                                                                                             | Colour code used to represent the complementary activity in the result.                                                                                                                           |
| + [distribution](#specifications_items_planningData_complementaryActivities_items_distribution )                 | No      | object          | No         | Same as [distribution](#specifications_items_planningData_sessions_items_distribution )                                       | Distribution                                                                                                                                                                                      |
| - [frameTemplate](#specifications_items_planningData_complementaryActivities_items_frameTemplate )               | No      | array of object | No         | Same as [frameTemplate](#specifications_items_planningData_sessions_items_frameTemplate )                                     | SessionFrameTemplate                                                                                                                                                                              |
| - [refClassRoomToAssign](#specifications_items_planningData_complementaryActivities_items_refClassRoomToAssign ) | No      | object          | No         | Same as [RefClassRoomToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items ) | RefClassRoomToAssign                                                                                                                                                                              |
| - [refBuilding](#specifications_items_planningData_complementaryActivities_items_refBuilding )                   | No      | string          | No         | -                                                                                                                             | Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom. |
| - [settings](#specifications_items_planningData_complementaryActivities_items_settings )                         | No      | object          | No         | Same as [settings](#specifications_items_planningData_meetings_items_settings )                                               | NonClassSessionSettings                                                                                                                                                                           |

###### <a name="specifications_items_planningData_complementaryActivities_items_id"></a>3.1.2.15.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Session identifier.

###### <a name="specifications_items_planningData_complementaryActivities_items_refFrame"></a>3.1.2.15.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

###### <a name="specifications_items_planningData_complementaryActivities_items_refTask"></a>3.1.2.15.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refTask`

**Title:** RefTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

###### <a name="specifications_items_planningData_complementaryActivities_items_refTeacher"></a>3.1.2.15.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refTeacher`

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher identifier.

###### <a name="specifications_items_planningData_complementaryActivities_items_refColourInResult"></a>3.1.2.15.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the complementary activity in the result.

###### <a name="specifications_items_planningData_complementaryActivities_items_distribution"></a>3.1.2.15.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > distribution`

**Title:** Distribution

|                           |                                                                                |
| ------------------------- | ------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                       |
| **Required**              | Yes                                                                            |
| **Additional properties** | Not allowed                                                                    |
| **Same definition as**    | [distribution](#specifications_items_planningData_sessions_items_distribution) |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

###### <a name="specifications_items_planningData_complementaryActivities_items_frameTemplate"></a>3.1.2.15.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > frameTemplate`

**Title:** SessionFrameTemplate

|                        |                                                                                  |
| ---------------------- | -------------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                                |
| **Required**           | No                                                                               |
| **Same definition as** | [frameTemplate](#specifications_items_planningData_sessions_items_frameTemplate) |

**Description:** Complete template of preferences.

###### <a name="specifications_items_planningData_complementaryActivities_items_refClassRoomToAssign"></a>3.1.2.15.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refClassRoomToAssign`

**Title:** RefClassRoomToAssign

|                           |                                                                                                                      |
| ------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                                             |
| **Required**              | No                                                                                                                   |
| **Additional properties** | Not allowed                                                                                                          |
| **Same definition as**    | [RefClassRoomToAssign](#specifications_items_planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items) |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

###### <a name="specifications_items_planningData_complementaryActivities_items_refBuilding"></a>3.1.2.15.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

###### <a name="specifications_items_planningData_complementaryActivities_items_settings"></a>3.1.2.15.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > complementaryActivities > Complementary > settings`

**Title:** NonClassSessionSettings

|                           |                                                                        |
| ------------------------- | ---------------------------------------------------------------------- |
| **Type**                  | `object`                                                               |
| **Required**              | No                                                                     |
| **Additional properties** | Not allowed                                                            |
| **Same definition as**    | [settings](#specifications_items_planningData_meetings_items_settings) |

**Description:** Settings of the meeting.

##### <a name="specifications_items_planningData_onCallServices"></a>3.1.2.16. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices`

**Title:** OnCallServices

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of on-call services of teachers defined in the timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                          | Description                                                          |
| ------------------------------------------------------------------------ | -------------------------------------------------------------------- |
| [OnCallService](#specifications_items_planningData_onCallServices_items) | On-call service of teachers who supervise the free time of students. |

###### <a name="specifications_items_planningData_onCallServices_items"></a>3.1.2.16.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService

**Title:** OnCallService

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** On-call service of teachers who supervise the free time of students.

| Property                                                                                              | Pattern | Type            | Deprecated | Definition                                                                                                                      | Title/Description                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#specifications_items_planningData_onCallServices_items_id )                                   | No      | string          | No         | -                                                                                                                               | On-Call service identifier.                                                                                                                               |
| + [refFrame](#specifications_items_planningData_onCallServices_items_refFrame )                       | No      | string          | No         | -                                                                                                                               | Identifier of the frame where the service will be set.                                                                                                    |
| - [refPeriods](#specifications_items_planningData_onCallServices_items_refPeriods )                   | No      | array of string | No         | -                                                                                                                               | RefPeriods                                                                                                                                                |
| + [refTask](#specifications_items_planningData_onCallServices_items_refTask )                         | No      | string          | No         | -                                                                                                                               | Task identifier.                                                                                                                                          |
| - [inBreak](#specifications_items_planningData_onCallServices_items_inBreak )                         | No      | boolean         | No         | -                                                                                                                               | It indicates whether it is a break supervision.                                                                                                           |
| + [teachersEachSection](#specifications_items_planningData_onCallServices_items_teachersEachSection ) | No      | object          | No         | -                                                                                                                               | TeachersEachSection                                                                                                                                       |
| + [refTeachers](#specifications_items_planningData_onCallServices_items_refTeachers )                 | No      | array of object | No         | -                                                                                                                               | RefTeachersOnCall                                                                                                                                         |
| - [refColourInResult](#specifications_items_planningData_onCallServices_items_refColourInResult )     | No      | string          | No         | -                                                                                                                               | Colour code used to represent the on-call service in the result.                                                                                          |
| - [frameTemplate](#specifications_items_planningData_onCallServices_items_frameTemplate )             | No      | array of object | No         | Same as [teacherFrameTemplate](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate ) | OnCallTemplate                                                                                                                                            |
| - [refBuilding](#specifications_items_planningData_onCallServices_items_refBuilding )                 | No      | string          | No         | -                                                                                                                               | Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers. |
| - [settings](#specifications_items_planningData_onCallServices_items_settings )                       | No      | object          | No         | Same as [settings](#specifications_items_planningData_meetings_items_settings )                                                 | NonClassSessionSettings                                                                                                                                   |

###### <a name="specifications_items_planningData_onCallServices_items_id"></a>3.1.2.16.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** On-Call service identifier.

###### <a name="specifications_items_planningData_onCallServices_items_refFrame"></a>3.1.2.16.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the frame where the service will be set.

###### <a name="specifications_items_planningData_onCallServices_items_refPeriods"></a>3.1.2.16.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refPeriods`

**Title:** RefPeriods

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of Periods when the service must be set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                       | Description        |
| ------------------------------------------------------------------------------------- | ------------------ |
| [RefPeriod](#specifications_items_planningData_onCallServices_items_refPeriods_items) | Period identifier. |

###### <a name="specifications_items_planningData_onCallServices_items_refPeriods_items"></a>3.1.2.16.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refPeriods > RefPeriod

**Title:** RefPeriod

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Period identifier.

###### <a name="specifications_items_planningData_onCallServices_items_refTask"></a>3.1.2.16.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTask`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

###### <a name="specifications_items_planningData_onCallServices_items_inBreak"></a>3.1.2.16.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > inBreak`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether it is a break supervision.

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection"></a>3.1.2.16.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection`

**Title:** TeachersEachSection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Information about number of teacher in all sections.

| Property                                                                                              | Pattern | Type            | Deprecated | Definition | Title/Description                                    |
| ----------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------------------- |
| - [byDefault](#specifications_items_planningData_onCallServices_items_teachersEachSection_byDefault ) | No      | integer         | No         | -          | Default value for number of teacher in all sections. |
| - [bySection](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection ) | No      | array of object | No         | -          | TeachersBySections                                   |

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection_byDefault"></a>3.1.2.16.1.6.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > byDefault`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Default value for number of teacher in all sections.

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection_bySection"></a>3.1.2.16.1.6.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection`

**Title:** TeachersBySections

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Custom number of teachers in each section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                  | Description                                         |
| ---------------------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| [TeachersBySection](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items) | Custom number of teachers in one timetable section. |

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items"></a>3.1.2.16.1.6.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection

**Title:** TeachersBySection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Custom number of teachers in one timetable section.

| Property                                                                                                                  | Pattern | Type    | Deprecated | Definition | Title/Description                                        |
| ------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------- |
| + [day](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_day )                 | No      | integer | No         | -          | Day of the week.                                         |
| + [index](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_index )             | No      | integer | No         | -          | Index of the section.                                    |
| + [numTeachers](#specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_numTeachers ) | No      | integer | No         | -          | Custom number of teachers to be assigned in the section. |

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_day"></a>3.1.2.16.1.6.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week.

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_index"></a>3.1.2.16.1.6.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index of the section.

###### <a name="specifications_items_planningData_onCallServices_items_teachersEachSection_bySection_items_numTeachers"></a>3.1.2.16.1.6.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > numTeachers`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Custom number of teachers to be assigned in the section.

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers"></a>3.1.2.16.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers`

**Title:** RefTeachersOnCall

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of teachers who in the service.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                         | Description                                                           |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| [RefTeacher](#specifications_items_planningData_onCallServices_items_refTeachers_items) | It contains a teacher reference and the number of section oversight . |

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items"></a>3.1.2.16.1.7.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher

**Title:** RefTeacher

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains a teacher reference and the number of section oversight .

| Property                                                                                                                  | Pattern | Type            | Deprecated | Definition                            | Title/Description                                            |
| ------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------- | ------------------------------------------------------------ |
| + [teacherId](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherId )                       | No      | string          | No         | -                                     | Teacher identifier.                                          |
| - [numOfSections](#specifications_items_planningData_onCallServices_items_refTeachers_items_numOfSections )               | No      | integer         | No         | -                                     | Number of on-call services to be done weekly by the teacher. |
| - [teacherFrameTemplate](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate ) | No      | array of object | No         | In #/$defs/onCallServiceframeTemplate | OnCallTemplate                                               |

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherId"></a>3.1.2.16.1.7.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherId`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher identifier.

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_numOfSections"></a>3.1.2.16.1.7.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > numOfSections`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** Number of on-call services to be done weekly by the teacher.

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate"></a>3.1.2.16.1.7.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate`

**Title:** OnCallTemplate

|                |                                    |
| -------------- | ---------------------------------- |
| **Type**       | `array of object`                  |
| **Required**   | No                                 |
| **Defined in** | #/$defs/onCallServiceframeTemplate |

**Description:** Template with teacher's preferences in the on-call service.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                 | Description                                                              |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| [OnCallSectionPreference](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items) | Template with a teacher section assignment preference about the service. |

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items"></a>3.1.2.16.1.7.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference

**Title:** OnCallSectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Template with a teacher section assignment preference about the service.

| Property                                                                                                               | Pattern | Type             | Deprecated | Definition | Title/Description                                  |
| ---------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | -------------------------------------------------- |
| + [day](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when is located the section.       |
| + [index](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index ) | No      | integer          | No         | -          | Index inside the day where is located the section. |
| + [frame](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame ) | No      | string           | No         | -          | Identifier name of the frame.                      |
| + [type](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeBannedPreset                  |

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day"></a>3.1.2.16.1.7.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when is located the section.

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index"></a>3.1.2.16.1.7.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index inside the day where is located the section.

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame"></a>3.1.2.16.1.7.1.3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the frame.

###### <a name="specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type"></a>3.1.2.16.1.7.1.3.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > type`

**Title:** SectionPreferenceTypeBannedPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Teacher availability to be assigned to the section.

Must be one of:
* "banned"
* "preset"

###### <a name="specifications_items_planningData_onCallServices_items_refColourInResult"></a>3.1.2.16.1.8. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the on-call service in the result.

###### <a name="specifications_items_planningData_onCallServices_items_frameTemplate"></a>3.1.2.16.1.9. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > frameTemplate`

**Title:** OnCallTemplate

|                        |                                                                                                                        |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                                                                      |
| **Required**           | No                                                                                                                     |
| **Same definition as** | [teacherFrameTemplate](#specifications_items_planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate) |

**Description:** Template with teacher's preferences in the on-call service.

###### <a name="specifications_items_planningData_onCallServices_items_refBuilding"></a>3.1.2.16.1.10. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.

###### <a name="specifications_items_planningData_onCallServices_items_settings"></a>3.1.2.16.1.11. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > onCallServices > OnCallService > settings`

**Title:** NonClassSessionSettings

|                           |                                                                        |
| ------------------------- | ---------------------------------------------------------------------- |
| **Type**                  | `object`                                                               |
| **Required**              | No                                                                     |
| **Additional properties** | Not allowed                                                            |
| **Same definition as**    | [settings](#specifications_items_planningData_meetings_items_settings) |

**Description:** Settings of the meeting.

##### <a name="specifications_items_planningData_optimizationWeights"></a>3.1.2.17. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights`

**Title:** OptimizationWeights

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.

| Property                                                                                                 | Pattern | Type   | Deprecated | Definition | Title/Description                 |
| -------------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | --------------------------------- |
| - [timetableGaps](#specifications_items_planningData_optimizationWeights_timetableGaps )                 | No      | object | No         | -          | TimetableGaps                     |
| - [nonPreferredPositions](#specifications_items_planningData_optimizationWeights_nonPreferredPositions ) | No      | object | No         | -          | NonPreferredPositionsOptimization |
| - [sessions](#specifications_items_planningData_optimizationWeights_sessions )                           | No      | object | No         | -          | SessionsOptimization              |
| - [teachers](#specifications_items_planningData_optimizationWeights_teachers )                           | No      | object | No         | -          | TeachersOptimization              |

###### <a name="specifications_items_planningData_optimizationWeights_timetableGaps"></a>3.1.2.17.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > timetableGaps`

**Title:** TimetableGaps

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to timetable-gaps weights.

| Property                                                                                           | Pattern | Type    | Deprecated | Definition | Title/Description                                                                  |
| -------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------- |
| - [groupGaps](#specifications_items_planningData_optimizationWeights_timetableGaps_groupGaps )     | No      | integer | No         | -          | It indicates the weight given to the fact of leaving gaps in groups' timetables.   |
| - [teacherGaps](#specifications_items_planningData_optimizationWeights_timetableGaps_teacherGaps ) | No      | integer | No         | -          | It indicates the weight given to the fact of leaving gaps in teachers' timetables. |

###### <a name="specifications_items_planningData_optimizationWeights_timetableGaps_groupGaps"></a>3.1.2.17.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > timetableGaps > groupGaps`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `5`       |

**Description:** It indicates the weight given to the fact of leaving gaps in groups' timetables.

###### <a name="specifications_items_planningData_optimizationWeights_timetableGaps_teacherGaps"></a>3.1.2.17.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > timetableGaps > teacherGaps`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight given to the fact of leaving gaps in teachers' timetables.

###### <a name="specifications_items_planningData_optimizationWeights_nonPreferredPositions"></a>3.1.2.17.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions`

**Title:** NonPreferredPositionsOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to allocation in non-preferred sections.

| Property                                                                                                               | Pattern | Type    | Deprecated | Definition | Title/Description                                                                          |
| ---------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------ |
| - [inGroups](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inGroups )                   | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a group.             |
| - [inTeachers](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inTeachers )               | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a teacher.           |
| - [inSubjectsAndTask](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inSubjectsAndTask ) | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a subject or a task. |
| - [inSessions](#specifications_items_planningData_optimizationWeights_nonPreferredPositions_inSessions )               | No      | integer | No         | -          | Indicates the weight to be placed in a non-preferential section of a session.              |

###### <a name="specifications_items_planningData_optimizationWeights_nonPreferredPositions_inGroups"></a>3.1.2.17.2.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inGroups`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `4`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a group.

###### <a name="specifications_items_planningData_optimizationWeights_nonPreferredPositions_inTeachers"></a>3.1.2.17.2.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inTeachers`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a teacher.

###### <a name="specifications_items_planningData_optimizationWeights_nonPreferredPositions_inSubjectsAndTask"></a>3.1.2.17.2.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inSubjectsAndTask`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a subject or a task.

###### <a name="specifications_items_planningData_optimizationWeights_nonPreferredPositions_inSessions"></a>3.1.2.17.2.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > nonPreferredPositions > inSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** Indicates the weight to be placed in a non-preferential section of a session.

###### <a name="specifications_items_planningData_optimizationWeights_sessions"></a>3.1.2.17.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions`

**Title:** SessionsOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to optimisable conditions for sessions.

| Property                                                                                                                        | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [nonPreferredClassRoom](#specifications_items_planningData_optimizationWeights_sessions_nonPreferredClassRoom )               | No      | integer | No         | -          | It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.                                                   |
| - [samePositionEveryPeriod](#specifications_items_planningData_optimizationWeights_sessions_samePositionEveryPeriod )           | No      | integer | No         | -          | It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).                                                                                                 |
| - [consecutiveDays](#specifications_items_planningData_optimizationWeights_sessions_consecutiveDays )                           | No      | integer | No         | -          | It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.                                                                  |
| - [bordersTimetable](#specifications_items_planningData_optimizationWeights_sessions_bordersTimetable )                         | No      | integer | No         | -          | It indicates the weight of the class units assigned at the ends of the timetable.                                                                                                                                                                          |
| - [afternoonOrAfterBreakClasses](#specifications_items_planningData_optimizationWeights_sessions_afternoonOrAfterBreakClasses ) | No      | integer | No         | -          | It indicates the weight of the penalty of having class units after the last break or in the afternoon.                                                                                                                                                     |
| - [sameHourSessionClasses](#specifications_items_planningData_optimizationWeights_sessions_sameHourSessionClasses )             | No      | integer | No         | -          | It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.                                                                                                                                               |
| - [classRoomsChanges](#specifications_items_planningData_optimizationWeights_sessions_classRoomsChanges )                       | No      | integer | No         | -          | It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break. |

###### <a name="specifications_items_planningData_optimizationWeights_sessions_nonPreferredClassRoom"></a>3.1.2.17.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > nonPreferredClassRoom`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.

###### <a name="specifications_items_planningData_optimizationWeights_sessions_samePositionEveryPeriod"></a>3.1.2.17.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > samePositionEveryPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).

###### <a name="specifications_items_planningData_optimizationWeights_sessions_consecutiveDays"></a>3.1.2.17.3.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > consecutiveDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.

###### <a name="specifications_items_planningData_optimizationWeights_sessions_bordersTimetable"></a>3.1.2.17.3.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > bordersTimetable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of the class units assigned at the ends of the timetable.

###### <a name="specifications_items_planningData_optimizationWeights_sessions_afternoonOrAfterBreakClasses"></a>3.1.2.17.3.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > afternoonOrAfterBreakClasses`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the penalty of having class units after the last break or in the afternoon.

###### <a name="specifications_items_planningData_optimizationWeights_sessions_sameHourSessionClasses"></a>3.1.2.17.3.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > sameHourSessionClasses`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.

###### <a name="specifications_items_planningData_optimizationWeights_sessions_classRoomsChanges"></a>3.1.2.17.3.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > sessions > classRoomsChanges`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.

###### <a name="specifications_items_planningData_optimizationWeights_teachers"></a>3.1.2.17.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers`

**Title:** TeachersOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to optimisable conditions for teachers.

| Property                                                                                                                      | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [teacherIncompatibities](#specifications_items_planningData_optimizationWeights_teachers_teacherIncompatibities )           | No      | integer | No         | -          | It indicates the weight of the teacher's incompatibilities that can be optimised.                                                                                               |
| - [uniformDailyDistribution](#specifications_items_planningData_optimizationWeights_teachers_uniformDailyDistribution )       | No      | integer | No         | -          | It indicates the weight of placing a teacher's class units in a non-uniform way during the week.                                                                                |
| - [excessContinuousTeaching](#specifications_items_planningData_optimizationWeights_teachers_excessContinuousTeaching )       | No      | integer | No         | -          | It indicates the weight of placing more continuous class units than those declared in the settings.                                                                             |
| - [excessPermanence](#specifications_items_planningData_optimizationWeights_teachers_excessPermanence )                       | No      | integer | No         | -          | It indicates the weight of assigning more daily or weekly stay than the declared in the settings.                                                                               |
| - [continuousSessionsWithGroup](#specifications_items_planningData_optimizationWeights_teachers_continuousSessionsWithGroup ) | No      | integer | No         | -          | It indicates the weight of having consecutive class units taught to the same group.                                                                                             |
| - [onCallSectionsOnBorders](#specifications_items_planningData_optimizationWeights_teachers_onCallSectionsOnBorders )         | No      | integer | No         | -          | It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units. |
| - [teacherOrder](#specifications_items_planningData_optimizationWeights_teachers_teacherOrder )                               | No      | integer | No         | -          | It indicates the weight of the teacher order not being assigned with a preference besides other teachers.                                                                       |

###### <a name="specifications_items_planningData_optimizationWeights_teachers_teacherIncompatibities"></a>3.1.2.17.4.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > teacherIncompatibities`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the teacher's incompatibilities that can be optimised.

###### <a name="specifications_items_planningData_optimizationWeights_teachers_uniformDailyDistribution"></a>3.1.2.17.4.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > uniformDailyDistribution`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of placing a teacher's class units in a non-uniform way during the week.

###### <a name="specifications_items_planningData_optimizationWeights_teachers_excessContinuousTeaching"></a>3.1.2.17.4.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > excessContinuousTeaching`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of placing more continuous class units than those declared in the settings.

###### <a name="specifications_items_planningData_optimizationWeights_teachers_excessPermanence"></a>3.1.2.17.4.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > excessPermanence`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of assigning more daily or weekly stay than the declared in the settings.

###### <a name="specifications_items_planningData_optimizationWeights_teachers_continuousSessionsWithGroup"></a>3.1.2.17.4.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > continuousSessionsWithGroup`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of having consecutive class units taught to the same group.

###### <a name="specifications_items_planningData_optimizationWeights_teachers_onCallSectionsOnBorders"></a>3.1.2.17.4.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > onCallSectionsOnBorders`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.

###### <a name="specifications_items_planningData_optimizationWeights_teachers_teacherOrder"></a>3.1.2.17.4.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > optimizationWeights > teachers > teacherOrder`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of the teacher order not being assigned with a preference besides other teachers.

##### <a name="specifications_items_planningData_engineSettings"></a>3.1.2.18. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > engineSettings`

**Title:** EngineSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Customised engine configuration parameters.

| Property                                                                                            | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                            |
| --------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| - [teacherBalance](#specifications_items_planningData_engineSettings_teacherBalance )               | No      | boolean | No         | -          | It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.                                                                                                               |
| - [countGapsAroundMidday](#specifications_items_planningData_engineSettings_countGapsAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable. |

###### <a name="specifications_items_planningData_engineSettings_teacherBalance"></a>3.1.2.18.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > engineSettings > teacherBalance`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.

###### <a name="specifications_items_planningData_engineSettings_countGapsAroundMidday"></a>3.1.2.18.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > planningData > engineSettings > countGapsAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.

#### <a name="specifications_items_results"></a>3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results`

**Title:** EngineResults

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Tables of the timetable that contain sections where the class units are located.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                     | Description                           |
| --------------------------------------------------- | ------------------------------------- |
| [EngineResult](#specifications_items_results_items) | GHC engine result from specification. |

##### <a name="specifications_items_results_items"></a>3.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineResult

**Title:** EngineResult

|                           |                                       |
| ------------------------- | ------------------------------------- |
| **Type**                  | `object`                              |
| **Required**              | No                                    |
| **Additional properties** | Not allowed                           |
| **Defined in**            | ../common/ghcEngineOutput.schema.json |

**Description:** GHC engine result from specification.

| Property                                                      | Pattern | Type    | Deprecated | Definition | Title/Description      |
| ------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------- |
| - [date](#specifications_items_results_items_date )           | No      | string  | No         | -          | JsonGenerationDate     |
| + [weight](#specifications_items_results_items_weight )       | No      | integer | No         | -          | ResultWeight           |
| + [timetable](#specifications_items_results_items_timetable ) | No      | object  | No         | -          | GeneratedJsonTimetable |

###### <a name="specifications_items_results_items_date"></a>3.1.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > date`

**Title:** JsonGenerationDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | No          |
| **Format**   | `date-time` |

**Description:** Date of result creation.

###### <a name="specifications_items_results_items_weight"></a>3.1.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > weight`

**Title:** ResultWeight

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Weight of the result according to the non-mandatory conditions not fulfilled.

###### <a name="specifications_items_results_items_timetable"></a>3.1.3.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable`

**Title:** GeneratedJsonTimetable

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Object with timetable specification resolved.

| Property                                                                                    | Pattern | Type            | Deprecated | Definition | Title/Description        |
| ------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------ |
| - [anonymousClassRooms](#specifications_items_results_items_timetable_anonymousClassRooms ) | No      | array of object | No         | -          | SetOfAnonymousClassRooms |
| + [assignedSections](#specifications_items_results_items_timetable_assignedSections )       | No      | array of object | No         | -          | AssignedSections         |

###### <a name="specifications_items_results_items_timetable_anonymousClassRooms"></a>3.1.3.1.3.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms`

**Title:** SetOfAnonymousClassRooms

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                               | Description                                                      |
| --------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- |
| [AnonymousClassRoom](#specifications_items_results_items_timetable_anonymousClassRooms_items) | Object with anonymous classrooms created in a set of classrooms. |

###### <a name="specifications_items_results_items_timetable_anonymousClassRooms_items"></a>3.1.3.1.3.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom

**Title:** AnonymousClassRoom

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Object with anonymous classrooms created in a set of classrooms.

| Property                                                                                                          | Pattern | Type            | Deprecated | Definition | Title/Description                   |
| ----------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------------------- |
| + [refClassRoomsSet](#specifications_items_results_items_timetable_anonymousClassRooms_items_refClassRoomsSet )   | No      | string          | No         | -          | Identifier of the ClassRooms group. |
| + [classRoomsCreated](#specifications_items_results_items_timetable_anonymousClassRooms_items_classRoomsCreated ) | No      | array of string | No         | -          | ListOfAnonymousRooms                |

###### <a name="specifications_items_results_items_timetable_anonymousClassRooms_items_refClassRoomsSet"></a>3.1.3.1.3.1.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > refClassRoomsSet`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the ClassRooms group.

###### <a name="specifications_items_results_items_timetable_anonymousClassRooms_items_classRoomsCreated"></a>3.1.3.1.3.1.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated`

**Title:** ListOfAnonymousRooms

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** List of anonymous classroom created in one set of classrooms.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                  | Description                            |
| ---------------------------------------------------------------------------------------------------------------- | -------------------------------------- |
| [AnonymousRoom](#specifications_items_results_items_timetable_anonymousClassRooms_items_classRoomsCreated_items) | Identifier of the anonymous classroom. |

###### <a name="specifications_items_results_items_timetable_anonymousClassRooms_items_classRoomsCreated_items"></a>3.1.3.1.3.1.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated > AnonymousRoom

**Title:** AnonymousRoom

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the anonymous classroom.

###### <a name="specifications_items_results_items_timetable_assignedSections"></a>3.1.3.1.3.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections`

**Title:** AssignedSections

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of sections assigned in the Timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                         | Description                                               |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------- |
| [AssignedSection](#specifications_items_results_items_timetable_assignedSections_items) | Section with one class units (or on call hours) assigned. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items"></a>3.1.3.1.3.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection

**Title:** AssignedSection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Section with one class units (or on call hours) assigned.

| Property                                                                                                 | Pattern | Type    | Deprecated | Definition | Title/Description                                                             |
| -------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------- |
| + [refFrame](#specifications_items_results_items_timetable_assignedSections_items_refFrame )             | No      | string  | No         | -          | Frame timetable section with assignment.                                      |
| + [day](#specifications_items_results_items_timetable_assignedSections_items_day )                       | No      | integer | No         | -          | Day of the week when the section is located.                                  |
| + [realIndex](#specifications_items_results_items_timetable_assignedSections_items_realIndex )           | No      | integer | No         | -          | Position on the day, of the real section, in the frame.                       |
| + [fictionalIndex](#specifications_items_results_items_timetable_assignedSections_items_fictionalIndex ) | No      | integer | No         | -          | Position on the day, of the fictional section, in the frame.                  |
| + [startTime](#specifications_items_results_items_timetable_assignedSections_items_startTime )           | No      | string  | No         | -          | Start time of the section with a fictional index where sessions are assigned. |
| + [endTime](#specifications_items_results_items_timetable_assignedSections_items_endTime )               | No      | string  | No         | -          | End time of the section with a fictional index where sessions are assigned.   |
| + [assignment](#specifications_items_results_items_timetable_assignedSections_items_assignment )         | No      | object  | No         | -          | Assignment                                                                    |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_refFrame"></a>3.1.3.1.3.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame timetable section with assignment.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_day"></a>3.1.3.1.3.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_realIndex"></a>3.1.3.1.3.2.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > realIndex`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Position on the day, of the real section, in the frame.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_fictionalIndex"></a>3.1.3.1.3.2.1.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > fictionalIndex`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Position on the day, of the fictional section, in the frame.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_startTime"></a>3.1.3.1.3.2.1.5. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > startTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** Start time of the section with a fictional index where sessions are assigned.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_endTime"></a>3.1.3.1.3.2.1.6. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > endTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** End time of the section with a fictional index where sessions are assigned.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment"></a>3.1.3.1.3.2.1.7. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment`

**Title:** Assignment

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).

| Property                                                                                                                              | Pattern | Type            | Deprecated | Definition | Title/Description               |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------- |
| - [teachingSessions](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions )               | No      | array of object | No         | -          | TeachingSessions                |
| - [meetings](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings )                               | No      | array of object | No         | -          | AssignedMeetings                |
| - [complementaryActivities](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities ) | No      | array of object | No         | -          | ComplementaryActivitiesAssigned |
| - [onCallServices](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices )                   | No      | array of object | No         | -          | OnCallServices                  |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions"></a>3.1.3.1.3.2.1.7.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions`

**Title:** TeachingSessions

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of teaching sessions assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                   | Description                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------- |
| [AssignedTeachingSession](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items) | Class unit or on call hour assigned in the timetable. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items"></a>3.1.3.1.3.2.1.7.1.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession

**Title:** AssignedTeachingSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Class unit or on call hour assigned in the timetable.

| Property                                                                                                                                 | Pattern | Type            | Deprecated | Definition               | Title/Description                            |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------ | -------------------------------------------- |
| + [refSession](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refSession )       | No      | integer         | No         | -                        | Identifier of the teaching session assigned. |
| + [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | No      | array of string | No         | In #/$defs/refClassRomms | RefclassRomms                                |
| - [refTeachers](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers )     | No      | array of string | No         | -                        | RefTeachers                                  |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refSession"></a>3.1.3.1.3.2.1.7.1.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refSession`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Identifier of the teaching session assigned.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms"></a>3.1.3.1.3.2.1.7.1.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms`

**Title:** RefclassRomms

|                |                       |
| -------------- | --------------------- |
| **Type**       | `array of string`     |
| **Required**   | Yes                   |
| **Defined in** | #/$defs/refClassRomms |

**Description:** List of classrooms assigned to teach the class unit.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                            | Description                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------- |
| [RefclassRomm](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items) | Identifier of the classroom in the input file. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items"></a>3.1.3.1.3.2.1.7.1.1.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms > RefclassRomm

**Title:** RefclassRomm

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the classroom in the input file.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers"></a>3.1.3.1.3.2.1.7.1.1.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers`

**Title:** RefTeachers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Optional. List of teachers assigned to the class unit. If the field is not informed, the teachers configured in the session are taken. The first is always the main teacher. It is used only in the case that alternative teachers have been configured.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                        | Description                                  |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------- |
| [RefTeacher](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items) | Identifier of the teacher in the input file. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items"></a>3.1.3.1.3.2.1.7.1.1.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers > RefTeacher

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the teacher in the input file.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_meetings"></a>3.1.3.1.3.2.1.7.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings`

**Title:** AssignedMeetings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of meetings assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                   | Description                                    |
| ----------------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| [AssignedMeeting](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items) | Meeting of teachers assigned in the timetable. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items"></a>3.1.3.1.3.2.1.7.2.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting

**Title:** AssignedMeeting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Meeting of teachers assigned in the timetable.

| Property                                                                                                                         | Pattern | Type            | Deprecated | Definition                                                                                                                                     | Title/Description                   |
| -------------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------- |
| + [refMeeting](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items_refMeeting )       | No      | string          | No         | -                                                                                                                                              | Identifier of the meeting assigned. |
| - [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items_refClassRomms ) | No      | array of string | No         | Same as [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | RefclassRomms                       |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items_refMeeting"></a>3.1.3.1.3.2.1.7.2.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refMeeting`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the meeting assigned.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_meetings_items_refClassRomms"></a>3.1.3.1.3.2.1.7.2.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refClassRomms`

**Title:** RefclassRomms

|                        |                                                                                                                                       |
| ---------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of string`                                                                                                                     |
| **Required**           | No                                                                                                                                    |
| **Same definition as** | [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms) |

**Description:** List of classrooms assigned to teach the class unit.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities"></a>3.1.3.1.3.2.1.7.3. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities`

**Title:** ComplementaryActivitiesAssigned

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of meetings assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                                        | Description                                                 |
| -------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------- |
| [AssignedComplementary](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items) | Teacher's complementary activity assigned in the timetable. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items"></a>3.1.3.1.3.2.1.7.3.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary

**Title:** AssignedComplementary

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's complementary activity assigned in the timetable.

| Property                                                                                                                                              | Pattern | Type            | Deprecated | Definition                                                                                                                                     | Title/Description                                  |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| + [refComplementary](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary ) | No      | string          | No         | -                                                                                                                                              | Identifier of the Complementary Activity assigned. |
| - [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms )       | No      | array of string | No         | Same as [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | RefclassRomms                                      |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary"></a>3.1.3.1.3.2.1.7.3.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refComplementary`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the Complementary Activity assigned.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms"></a>3.1.3.1.3.2.1.7.3.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refClassRomms`

**Title:** RefclassRomms

|                        |                                                                                                                                       |
| ---------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of string`                                                                                                                     |
| **Required**           | No                                                                                                                                    |
| **Same definition as** | [refClassRomms](#specifications_items_results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms) |

**Description:** List of classrooms assigned to teach the class unit.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices"></a>3.1.3.1.3.2.1.7.4. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices`

**Title:** OnCallServices

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of teaching on call hours assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                                               | Description                          |
| ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| [AssignedOnCallService](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items) | Call hour assigned in the timetable. |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items"></a>3.1.3.1.3.2.1.7.4.1. GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService

**Title:** AssignedOnCallService

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Call hour assigned in the timetable.

| Property                                                                                                                         | Pattern | Type   | Deprecated | Definition | Title/Description                            |
| -------------------------------------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | -------------------------------------------- |
| + [refOnCall](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items_refOnCall )   | No      | string | No         | -          | Identifier of the teaching session assigned. |
| + [refTeacher](#specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items_refTeacher ) | No      | string | No         | -          | RefTeachers                                  |

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items_refOnCall"></a>3.1.3.1.3.2.1.7.4.1.1. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refOnCall`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the teaching session assigned.

###### <a name="specifications_items_results_items_timetable_assignedSections_items_assignment_onCallServices_items_refTeacher"></a>3.1.3.1.3.2.1.7.4.1.2. Property `GhcMultiplatformSchema > specifications > PlannerSpecification > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refTeacher`

**Title:** RefTeachers

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher assigned in section on call service.

----------------------------------------------------------------------------------------------------------------------------
Generated using [json-schema-for-humans](https://github.com/coveooss/json-schema-for-humans) on 2026-11-09 at 11:34:14 +0100
