package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class PicTextItem extends Message {
    public static final String DEFAULT_ITEM_PIC = "";
    public static final String DEFAULT_ITEM_TEXT = "";
    public static final String DEFAULT_ITEM_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String item_pic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String item_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String item_url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PicTextItem> {
        public String item_pic;
        public String item_text;
        public String item_url;

        public Builder() {
        }

        public Builder(PicTextItem picTextItem) {
            super(picTextItem);
            if (picTextItem == null) {
                return;
            }
            this.item_pic = picTextItem.item_pic;
            this.item_url = picTextItem.item_url;
            this.item_text = picTextItem.item_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PicTextItem build(boolean z) {
            return new PicTextItem(this, z);
        }
    }

    public PicTextItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.item_pic;
            if (str == null) {
                this.item_pic = "";
            } else {
                this.item_pic = str;
            }
            String str2 = builder.item_url;
            if (str2 == null) {
                this.item_url = "";
            } else {
                this.item_url = str2;
            }
            String str3 = builder.item_text;
            if (str3 == null) {
                this.item_text = "";
                return;
            } else {
                this.item_text = str3;
                return;
            }
        }
        this.item_pic = builder.item_pic;
        this.item_url = builder.item_url;
        this.item_text = builder.item_text;
    }
}
