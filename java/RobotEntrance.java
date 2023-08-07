package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RobotEntrance extends Message {
    public static final String DEFAULT_BOTTOM_BAR_CLICK_GUIDE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bottom_bar_click_guide;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RobotSkill> bottom_bar_robot_skill;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<RobotSkill> first_floor_bar_robot_skill;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RobotSkillInfo> robot_skill_info;
    public static final List<RobotSkillInfo> DEFAULT_ROBOT_SKILL_INFO = Collections.emptyList();
    public static final List<RobotSkill> DEFAULT_BOTTOM_BAR_ROBOT_SKILL = Collections.emptyList();
    public static final List<RobotSkill> DEFAULT_FIRST_FLOOR_BAR_ROBOT_SKILL = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RobotEntrance> {
        public String bottom_bar_click_guide;
        public List<RobotSkill> bottom_bar_robot_skill;
        public List<RobotSkill> first_floor_bar_robot_skill;
        public List<RobotSkillInfo> robot_skill_info;

        public Builder() {
        }

        public Builder(RobotEntrance robotEntrance) {
            super(robotEntrance);
            if (robotEntrance == null) {
                return;
            }
            this.robot_skill_info = Message.copyOf(robotEntrance.robot_skill_info);
            this.bottom_bar_robot_skill = Message.copyOf(robotEntrance.bottom_bar_robot_skill);
            this.first_floor_bar_robot_skill = Message.copyOf(robotEntrance.first_floor_bar_robot_skill);
            this.bottom_bar_click_guide = robotEntrance.bottom_bar_click_guide;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RobotEntrance build(boolean z) {
            return new RobotEntrance(this, z);
        }
    }

    public RobotEntrance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<RobotSkillInfo> list = builder.robot_skill_info;
            if (list == null) {
                this.robot_skill_info = DEFAULT_ROBOT_SKILL_INFO;
            } else {
                this.robot_skill_info = Message.immutableCopyOf(list);
            }
            List<RobotSkill> list2 = builder.bottom_bar_robot_skill;
            if (list2 == null) {
                this.bottom_bar_robot_skill = DEFAULT_BOTTOM_BAR_ROBOT_SKILL;
            } else {
                this.bottom_bar_robot_skill = Message.immutableCopyOf(list2);
            }
            List<RobotSkill> list3 = builder.first_floor_bar_robot_skill;
            if (list3 == null) {
                this.first_floor_bar_robot_skill = DEFAULT_FIRST_FLOOR_BAR_ROBOT_SKILL;
            } else {
                this.first_floor_bar_robot_skill = Message.immutableCopyOf(list3);
            }
            String str = builder.bottom_bar_click_guide;
            if (str == null) {
                this.bottom_bar_click_guide = "";
                return;
            } else {
                this.bottom_bar_click_guide = str;
                return;
            }
        }
        this.robot_skill_info = Message.immutableCopyOf(builder.robot_skill_info);
        this.bottom_bar_robot_skill = Message.immutableCopyOf(builder.bottom_bar_robot_skill);
        this.first_floor_bar_robot_skill = Message.immutableCopyOf(builder.first_floor_bar_robot_skill);
        this.bottom_bar_click_guide = builder.bottom_bar_click_guide;
    }
}
