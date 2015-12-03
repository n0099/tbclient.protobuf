package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* synthetic */ PicTextItem(Builder builder, boolean z, PicTextItem picTextItem) {
        this(builder, z);
    }

    private PicTextItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.item_pic == null) {
                this.item_pic = "";
            } else {
                this.item_pic = builder.item_pic;
            }
            if (builder.item_url == null) {
                this.item_url = "";
            } else {
                this.item_url = builder.item_url;
            }
            if (builder.item_text == null) {
                this.item_text = "";
                return;
            } else {
                this.item_text = builder.item_text;
                return;
            }
        }
        this.item_pic = builder.item_pic;
        this.item_url = builder.item_url;
        this.item_text = builder.item_text;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PicTextItem> {
        public String item_pic;
        public String item_text;
        public String item_url;

        public Builder() {
        }

        public Builder(PicTextItem picTextItem) {
            super(picTextItem);
            if (picTextItem != null) {
                this.item_pic = picTextItem.item_pic;
                this.item_url = picTextItem.item_url;
                this.item_text = picTextItem.item_text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PicTextItem build(boolean z) {
            return new PicTextItem(this, z, null);
        }
    }
}
