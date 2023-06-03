package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AbilityConf extends Message {
    public static final String DEFAULT_BOT_UK = "";
    public static final Integer DEFAULT_SKILL_ID = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bot_uk;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer skill_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AbilityConf> {
        public String bot_uk;
        public Integer skill_id;

        public Builder() {
        }

        public Builder(AbilityConf abilityConf) {
            super(abilityConf);
            if (abilityConf == null) {
                return;
            }
            this.bot_uk = abilityConf.bot_uk;
            this.skill_id = abilityConf.skill_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AbilityConf build(boolean z) {
            return new AbilityConf(this, z);
        }
    }

    public AbilityConf(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.bot_uk;
            if (str == null) {
                this.bot_uk = "";
            } else {
                this.bot_uk = str;
            }
            Integer num = builder.skill_id;
            if (num == null) {
                this.skill_id = DEFAULT_SKILL_ID;
                return;
            } else {
                this.skill_id = num;
                return;
            }
        }
        this.bot_uk = builder.bot_uk;
        this.skill_id = builder.skill_id;
    }
}
