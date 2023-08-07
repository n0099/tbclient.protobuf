package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RobotSkill extends Message {
    public static final String DEFAULT_ROBOT_UK = "";
    public static final List<Integer> DEFAULT_SKILL_IDS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String robot_uk;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
    public final List<Integer> skill_ids;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RobotSkill> {
        public String robot_uk;
        public List<Integer> skill_ids;

        public Builder() {
        }

        public Builder(RobotSkill robotSkill) {
            super(robotSkill);
            if (robotSkill == null) {
                return;
            }
            this.robot_uk = robotSkill.robot_uk;
            this.skill_ids = Message.copyOf(robotSkill.skill_ids);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RobotSkill build(boolean z) {
            return new RobotSkill(this, z);
        }
    }

    public RobotSkill(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.robot_uk;
            if (str == null) {
                this.robot_uk = "";
            } else {
                this.robot_uk = str;
            }
            List<Integer> list = builder.skill_ids;
            if (list == null) {
                this.skill_ids = DEFAULT_SKILL_IDS;
                return;
            } else {
                this.skill_ids = Message.immutableCopyOf(list);
                return;
            }
        }
        this.robot_uk = builder.robot_uk;
        this.skill_ids = Message.immutableCopyOf(builder.skill_ids);
    }
}
