package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class HotTwzbThread extends Message {
    public static final String DEFAULT_MORE_LINK = "";
    public static final String DEFAULT_MORE_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5)
    public final BannerTwzbInfo banner_twzb;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<TwzbThreadItem> items;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String more_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String more_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_MID = 0L;
    public static final List<TwzbThreadItem> DEFAULT_ITEMS = Collections.emptyList();

    /* synthetic */ HotTwzbThread(Builder builder, boolean z, HotTwzbThread hotTwzbThread) {
        this(builder, z);
    }

    private HotTwzbThread(Builder builder, boolean z) {
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
            this.banner_twzb = builder.banner_twzb;
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
        this.banner_twzb = builder.banner_twzb;
        this.items = immutableCopyOf(builder.items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotTwzbThread> {
        public BannerTwzbInfo banner_twzb;
        public List<TwzbThreadItem> items;
        public Long mid;
        public String more_link;
        public String more_text;
        public String title;

        public Builder() {
        }

        public Builder(HotTwzbThread hotTwzbThread) {
            super(hotTwzbThread);
            if (hotTwzbThread != null) {
                this.mid = hotTwzbThread.mid;
                this.title = hotTwzbThread.title;
                this.more_text = hotTwzbThread.more_text;
                this.more_link = hotTwzbThread.more_link;
                this.banner_twzb = hotTwzbThread.banner_twzb;
                this.items = HotTwzbThread.copyOf(hotTwzbThread.items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTwzbThread build(boolean z) {
            return new HotTwzbThread(this, z, null);
        }
    }
}
