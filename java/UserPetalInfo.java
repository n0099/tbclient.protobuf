package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserPetalInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer petal_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_PETAL_NUM = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserPetalInfo> {
        public Integer petal_num;
        public Long user_id;

        public Builder() {
        }

        public Builder(UserPetalInfo userPetalInfo) {
            super(userPetalInfo);
            if (userPetalInfo == null) {
                return;
            }
            this.user_id = userPetalInfo.user_id;
            this.petal_num = userPetalInfo.petal_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPetalInfo build(boolean z) {
            return new UserPetalInfo(this, z);
        }
    }

    public UserPetalInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Integer num = builder.petal_num;
            if (num == null) {
                this.petal_num = DEFAULT_PETAL_NUM;
                return;
            } else {
                this.petal_num = num;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.petal_num = builder.petal_num;
    }
}
