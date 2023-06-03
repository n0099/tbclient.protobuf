package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CallRobotEntrance extends Message {
    public static final String DEFAULT_ABILITY_TYPE = "";
    @ProtoField(tag = 2)
    public final AbilityConf ability_conf;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ability_type;
    @ProtoField(tag = 3)
    public final StyleConf style_conf;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CallRobotEntrance> {
        public AbilityConf ability_conf;
        public String ability_type;
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
            return;
        }
        this.ability_type = builder.ability_type;
        this.ability_conf = builder.ability_conf;
        this.style_conf = builder.style_conf;
    }
}
