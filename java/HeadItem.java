package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class HeadItem extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HeadItem> {
        public String content;
        public String name;
        public Integer type;

        public Builder() {
        }

        public Builder(HeadItem headItem) {
            super(headItem);
            if (headItem == null) {
                return;
            }
            this.name = headItem.name;
            this.content = headItem.content;
            this.type = headItem.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadItem build(boolean z) {
            return new HeadItem(this, z);
        }
    }

    public HeadItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num;
                return;
            }
        }
        this.name = builder.name;
        this.content = builder.content;
        this.type = builder.type;
    }
}
