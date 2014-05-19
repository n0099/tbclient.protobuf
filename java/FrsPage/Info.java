package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Info extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_num;
    public static final Integer DEFAULT_USER_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;

    /* synthetic */ Info(Builder builder, boolean z, Info info) {
        this(builder, z);
    }

    private Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_num == null) {
                this.user_num = DEFAULT_USER_NUM;
            } else {
                this.user_num = builder.user_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
                return;
            } else {
                this.post_num = builder.post_num;
                return;
            }
        }
        this.user_num = builder.user_num;
        this.post_num = builder.post_num;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Info> {
        public Integer post_num;
        public Integer user_num;

        public Builder(Info info) {
            super(info);
            if (info != null) {
                this.user_num = info.user_num;
                this.post_num = info.post_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Info build(boolean z) {
            return new Info(this, z, null);
        }
    }
}
