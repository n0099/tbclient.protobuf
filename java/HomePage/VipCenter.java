package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PicTextItem;
/* loaded from: classes.dex */
public final class VipCenter extends Message {
    public static final String DEFAULT_BANNER_ITEM_PIC = "";
    public static final String DEFAULT_BANNER_ITEM_URL = "";
    public static final String DEFAULT_MORE_LINK = "";
    public static final String DEFAULT_MORE_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String banner_item_pic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String banner_item_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<PicTextItem> items;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String more_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String more_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_MID = 0L;
    public static final List<PicTextItem> DEFAULT_ITEMS = Collections.emptyList();

    /* synthetic */ VipCenter(Builder builder, boolean z, VipCenter vipCenter) {
        this(builder, z);
    }

    private VipCenter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mid == null) {
                this.mid = DEFAULT_MID;
            } else {
                this.mid = builder.mid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.more_text == null) {
                this.more_text = "";
            } else {
                this.more_text = builder.more_text;
            }
            if (builder.more_link == null) {
                this.more_link = "";
            } else {
                this.more_link = builder.more_link;
            }
            if (builder.banner_item_pic == null) {
                this.banner_item_pic = "";
            } else {
                this.banner_item_pic = builder.banner_item_pic;
            }
            if (builder.banner_item_url == null) {
                this.banner_item_url = "";
            } else {
                this.banner_item_url = builder.banner_item_url;
            }
            if (builder.items == null) {
                this.items = DEFAULT_ITEMS;
                return;
            } else {
                this.items = immutableCopyOf(builder.items);
                return;
            }
        }
        this.mid = builder.mid;
        this.title = builder.title;
        this.more_text = builder.more_text;
        this.more_link = builder.more_link;
        this.banner_item_pic = builder.banner_item_pic;
        this.banner_item_url = builder.banner_item_url;
        this.items = immutableCopyOf(builder.items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<VipCenter> {
        public String banner_item_pic;
        public String banner_item_url;
        public List<PicTextItem> items;
        public Long mid;
        public String more_link;
        public String more_text;
        public String title;

        public Builder() {
        }

        public Builder(VipCenter vipCenter) {
            super(vipCenter);
            if (vipCenter != null) {
                this.mid = vipCenter.mid;
                this.title = vipCenter.title;
                this.more_text = vipCenter.more_text;
                this.more_link = vipCenter.more_link;
                this.banner_item_pic = vipCenter.banner_item_pic;
                this.banner_item_url = vipCenter.banner_item_url;
                this.items = VipCenter.copyOf(vipCenter.items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipCenter build(boolean z) {
            return new VipCenter(this, z, null);
        }
    }
}
