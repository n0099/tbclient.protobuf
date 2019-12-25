package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class AwardUser extends Message {
    public static final String DEFAULT_AWARD_NAME = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer award_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_AWARD_TIME = 0;

    private AwardUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.award_name == null) {
                this.award_name = "";
            } else {
                this.award_name = builder.award_name;
            }
            if (builder.award_time == null) {
                this.award_time = DEFAULT_AWARD_TIME;
                return;
            } else {
                this.award_time = builder.award_time;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.award_name = builder.award_name;
        this.award_time = builder.award_time;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<AwardUser> {
        public String award_name;
        public Integer award_time;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(AwardUser awardUser) {
            super(awardUser);
            if (awardUser != null) {
                this.user_id = awardUser.user_id;
                this.user_name = awardUser.user_name;
                this.award_name = awardUser.award_name;
                this.award_time = awardUser.award_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AwardUser build(boolean z) {
            return new AwardUser(this, z);
        }
    }
}
