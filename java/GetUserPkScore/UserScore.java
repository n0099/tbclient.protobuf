package tbclient.GetUserPkScore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class UserScore extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long score;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_SCORE = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<UserScore> {
        public Long score;
        public Long user_id;

        public Builder() {
        }

        public Builder(UserScore userScore) {
            super(userScore);
            if (userScore == null) {
                return;
            }
            this.user_id = userScore.user_id;
            this.score = userScore.score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserScore build(boolean z) {
            return new UserScore(this, z);
        }
    }

    public UserScore(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Long l2 = builder.score;
            if (l2 == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = l2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.score = builder.score;
    }
}
