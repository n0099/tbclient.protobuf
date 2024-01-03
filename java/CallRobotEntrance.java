package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CallRobotEntrance extends Message {
    public static final String DEFAULT_ABILITY_TYPE = "";
    public static final Integer DEFAULT_SKILL_ID = 0;
    @ProtoField(tag = 2)
    public final AbilityConf ability_conf;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ability_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer skill_id;
    @ProtoField(tag = 3)
    public final StyleConf style_conf;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CallRobotEntrance> {
        public AbilityConf ability_conf;
        public String ability_type;
        public Integer skill_id;
        public StyleConf style_conf;

        public Builder() {
        }

        public Builder(CallRobotEntrance callRobotEntrance) {
            super(callRobotEntrance);
            if (callRobotEntrance == null) {
                return;
            }
            this.ability_type = callRobotEntrance.ability_type;
            this.ability_conf = callRobotEntrance.ability_conf;
            this.style_conf = callRobotEntrance.style_conf;
            this.skill_id = callRobotEntrance.skill_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CallRobotEntrance build(boolean z) {
            return new CallRobotEntrance(this, z);
        }
    }

    public CallRobotEntrance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.ability_type;
            if (str == null) {
                this.ability_type = "";
            } else {
                this.ability_type = str;
            }
            this.ability_conf = builder.ability_conf;
            this.style_conf = builder.style_conf;
            Integer num = builder.skill_id;
            if (num == null) {
                this.skill_id = DEFAULT_SKILL_ID;
                return;
            } else {
                this.skill_id = num;
                return;
            }
        }
        this.ability_type = builder.ability_type;
        this.ability_conf = builder.ability_conf;
        this.style_conf = builder.style_conf;
        this.skill_id = builder.skill_id;
    }
}
