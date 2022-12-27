package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class BawuAction extends Message {
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_UNREAD_NUM = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer unread_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BawuAction> {
        public String name;
        public Integer type;
        public Integer unread_num;
        public String url;

        public Builder() {
        }

        public Builder(BawuAction bawuAction) {
            super(bawuAction);
            if (bawuAction == null) {
                return;
            }
            this.name = bawuAction.name;
            this.type = bawuAction.type;
            this.url = bawuAction.url;
            this.unread_num = bawuAction.unread_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuAction build(boolean z) {
            return new BawuAction(this, z);
        }
    }

    public BawuAction(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            Integer num2 = builder.unread_num;
            if (num2 == null) {
                this.unread_num = DEFAULT_UNREAD_NUM;
                return;
            } else {
                this.unread_num = num2;
                return;
            }
        }
        this.name = builder.name;
        this.type = builder.type;
        this.url = builder.url;
        this.unread_num = builder.unread_num;
    }
}
