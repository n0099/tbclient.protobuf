package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TabPicDesc extends Message {
    public static final Integer DEFAULT_PIC_HEIGHT = 0;
    public static final Integer DEFAULT_PIC_WIDTH = 0;
    public static final String DEFAULT_SELECTED_PIC_URL = "";
    public static final String DEFAULT_UNSELECTED_PIC_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pic_height;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pic_width;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String selected_pic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String unselected_pic_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TabPicDesc> {
        public Integer pic_height;
        public Integer pic_width;
        public String selected_pic_url;
        public String unselected_pic_url;

        public Builder() {
        }

        public Builder(TabPicDesc tabPicDesc) {
            super(tabPicDesc);
            if (tabPicDesc == null) {
                return;
            }
            this.selected_pic_url = tabPicDesc.selected_pic_url;
            this.unselected_pic_url = tabPicDesc.unselected_pic_url;
            this.pic_height = tabPicDesc.pic_height;
            this.pic_width = tabPicDesc.pic_width;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabPicDesc build(boolean z) {
            return new TabPicDesc(this, z);
        }
    }

    public TabPicDesc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.selected_pic_url;
            if (str == null) {
                this.selected_pic_url = "";
            } else {
                this.selected_pic_url = str;
            }
            String str2 = builder.unselected_pic_url;
            if (str2 == null) {
                this.unselected_pic_url = "";
            } else {
                this.unselected_pic_url = str2;
            }
            Integer num = builder.pic_height;
            if (num == null) {
                this.pic_height = DEFAULT_PIC_HEIGHT;
            } else {
                this.pic_height = num;
            }
            Integer num2 = builder.pic_width;
            if (num2 == null) {
                this.pic_width = DEFAULT_PIC_WIDTH;
                return;
            } else {
                this.pic_width = num2;
                return;
            }
        }
        this.selected_pic_url = builder.selected_pic_url;
        this.unselected_pic_url = builder.unselected_pic_url;
        this.pic_height = builder.pic_height;
        this.pic_width = builder.pic_width;
    }
}
