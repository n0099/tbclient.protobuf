package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_mem;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scores_total;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_IS_MEM = 0;
    public static final Integer DEFAULT_SCORES_TOTAL = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public Integer is_mem;
        public Integer scores_total;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo == null) {
                return;
            }
            this.user_id = userInfo.user_id;
            this.user_name = userInfo.user_name;
            this.is_mem = userInfo.is_mem;
            this.scores_total = userInfo.scores_total;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            return new UserInfo(this, z);
        }
    }

    public UserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Integer num = builder.is_mem;
            if (num == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = num;
            }
            Integer num2 = builder.scores_total;
            if (num2 == null) {
                this.scores_total = DEFAULT_SCORES_TOTAL;
                return;
            } else {
                this.scores_total = num2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.is_mem = builder.is_mem;
        this.scores_total = builder.scores_total;
    }
}
