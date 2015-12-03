package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PicTextItem;
/* loaded from: classes.dex */
public final class FunCenter extends Message {
    public static final String DEFAULT_MORE_LINK = "";
    public static final String DEFAULT_MORE_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<AppItem> app_items;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PicTextItem> carousel_items;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String more_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String more_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_MID = 0L;
    public static final List<PicTextItem> DEFAULT_CAROUSEL_ITEMS = Collections.emptyList();
    public static final List<AppItem> DEFAULT_APP_ITEMS = Collections.emptyList();

    /* synthetic */ FunCenter(Builder builder, boolean z, FunCenter funCenter) {
        this(builder, z);
    }

    private FunCenter(Builder builder, boolean z) {
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
            if (builder.carousel_items == null) {
                this.carousel_items = DEFAULT_CAROUSEL_ITEMS;
            } else {
                this.carousel_items = immutableCopyOf(builder.carousel_items);
            }
            if (builder.app_items == null) {
                this.app_items = DEFAULT_APP_ITEMS;
                return;
            } else {
                this.app_items = immutableCopyOf(builder.app_items);
                return;
            }
        }
        this.mid = builder.mid;
        this.title = builder.title;
        this.more_text = builder.more_text;
        this.more_link = builder.more_link;
        this.carousel_items = immutableCopyOf(builder.carousel_items);
        this.app_items = immutableCopyOf(builder.app_items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<FunCenter> {
        public List<AppItem> app_items;
        public List<PicTextItem> carousel_items;
        public Long mid;
        public String more_link;
        public String more_text;
        public String title;

        public Builder() {
        }

        public Builder(FunCenter funCenter) {
            super(funCenter);
            if (funCenter != null) {
                this.mid = funCenter.mid;
                this.title = funCenter.title;
                this.more_text = funCenter.more_text;
                this.more_link = funCenter.more_link;
                this.carousel_items = FunCenter.copyOf(funCenter.carousel_items);
                this.app_items = FunCenter.copyOf(funCenter.app_items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FunCenter build(boolean z) {
            return new FunCenter(this, z, null);
        }
    }
}
