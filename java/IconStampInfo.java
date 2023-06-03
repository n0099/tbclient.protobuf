package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class IconStampInfo extends Message {
    public static final String DEFAULT_STAMP_TEXT = "";
    public static final String DEFAULT_STAMP_TITLE = "";
    public static final Integer DEFAULT_STAMP_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String stamp_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String stamp_title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer stamp_type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<IconStampInfo> {
        public String stamp_text;
        public String stamp_title;
        public Integer stamp_type;

        public Builder() {
        }

        public Builder(IconStampInfo iconStampInfo) {
            super(iconStampInfo);
            if (iconStampInfo == null) {
                return;
            }
            this.stamp_title = iconStampInfo.stamp_title;
            this.stamp_text = iconStampInfo.stamp_text;
            this.stamp_type = iconStampInfo.stamp_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconStampInfo build(boolean z) {
            return new IconStampInfo(this, z);
        }
    }

    public IconStampInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.stamp_title;
            if (str == null) {
                this.stamp_title = "";
            } else {
                this.stamp_title = str;
            }
            String str2 = builder.stamp_text;
            if (str2 == null) {
                this.stamp_text = "";
            } else {
                this.stamp_text = str2;
            }
            Integer num = builder.stamp_type;
            if (num == null) {
                this.stamp_type = DEFAULT_STAMP_TYPE;
                return;
            } else {
                this.stamp_type = num;
                return;
            }
        }
        this.stamp_title = builder.stamp_title;
        this.stamp_text = builder.stamp_text;
        this.stamp_type = builder.stamp_type;
    }
}
