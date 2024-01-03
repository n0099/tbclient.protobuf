package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class LayoutManageInfo extends Message {
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LayoutManageInfo> {
        public String ext;
        public String text;
        public Integer type;

        public Builder() {
        }

        public Builder(LayoutManageInfo layoutManageInfo) {
            super(layoutManageInfo);
            if (layoutManageInfo == null) {
                return;
            }
            this.text = layoutManageInfo.text;
            this.type = layoutManageInfo.type;
            this.ext = layoutManageInfo.ext;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LayoutManageInfo build(boolean z) {
            return new LayoutManageInfo(this, z);
        }
    }

    public LayoutManageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str2 = builder.ext;
            if (str2 == null) {
                this.ext = "";
                return;
            } else {
                this.ext = str2;
                return;
            }
        }
        this.text = builder.text;
        this.type = builder.type;
        this.ext = builder.ext;
    }
}
