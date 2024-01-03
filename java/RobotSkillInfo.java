package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RobotSkillInfo extends Message {
    public static final String DEFAULT_NEW_SKILL_GUIDE = "";
    public static final String DEFAULT_ROBOT_NAME = "";
    public static final String DEFAULT_ROBOT_PORTRAIT = "";
    public static final List<CallRobotEntrance> DEFAULT_ROBOT_SKILL_LIST = Collections.emptyList();
    public static final String DEFAULT_ROBOT_UK = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String new_skill_guide;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String robot_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String robot_portrait;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<CallRobotEntrance> robot_skill_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String robot_uk;
    @ProtoField(tag = 6)
    public final StyleContentInfo style_dark;
    @ProtoField(tag = 5)
    public final StyleContentInfo style_day;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RobotSkillInfo> {
        public String new_skill_guide;
        public String robot_name;
        public String robot_portrait;
        public List<CallRobotEntrance> robot_skill_list;
        public String robot_uk;
        public StyleContentInfo style_dark;
        public StyleContentInfo style_day;

        public Builder() {
        }

        public Builder(RobotSkillInfo robotSkillInfo) {
            super(robotSkillInfo);
            if (robotSkillInfo == null) {
                return;
            }
            this.robot_skill_list = Message.copyOf(robotSkillInfo.robot_skill_list);
            this.robot_uk = robotSkillInfo.robot_uk;
            this.robot_portrait = robotSkillInfo.robot_portrait;
            this.robot_name = robotSkillInfo.robot_name;
            this.style_day = robotSkillInfo.style_day;
            this.style_dark = robotSkillInfo.style_dark;
            this.new_skill_guide = robotSkillInfo.new_skill_guide;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RobotSkillInfo build(boolean z) {
            return new RobotSkillInfo(this, z);
        }
    }

    public RobotSkillInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<CallRobotEntrance> list = builder.robot_skill_list;
            if (list == null) {
                this.robot_skill_list = DEFAULT_ROBOT_SKILL_LIST;
            } else {
                this.robot_skill_list = Message.immutableCopyOf(list);
            }
            String str = builder.robot_uk;
            if (str == null) {
                this.robot_uk = "";
            } else {
                this.robot_uk = str;
            }
            String str2 = builder.robot_portrait;
            if (str2 == null) {
                this.robot_portrait = "";
            } else {
                this.robot_portrait = str2;
            }
            String str3 = builder.robot_name;
            if (str3 == null) {
                this.robot_name = "";
            } else {
                this.robot_name = str3;
            }
            this.style_day = builder.style_day;
            this.style_dark = builder.style_dark;
            String str4 = builder.new_skill_guide;
            if (str4 == null) {
                this.new_skill_guide = "";
                return;
            } else {
                this.new_skill_guide = str4;
                return;
            }
        }
        this.robot_skill_list = Message.immutableCopyOf(builder.robot_skill_list);
        this.robot_uk = builder.robot_uk;
        this.robot_portrait = builder.robot_portrait;
        this.robot_name = builder.robot_name;
        this.style_day = builder.style_day;
        this.style_dark = builder.style_dark;
        this.new_skill_guide = builder.new_skill_guide;
    }
}
