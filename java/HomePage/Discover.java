package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Discover extends Message {
    public static final String DEFAULT_MORE_LINK = "";
    public static final String DEFAULT_MORE_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<DiscoverItem> items;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String more_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String more_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_MID = 0L;
    public static final List<DiscoverItem> DEFAULT_ITEMS = Collections.emptyList();

    /* synthetic */ Discover(Builder builder, boolean z, Discover discover) {
        this(builder, z);
    }

    private Discover(Builder builder, boolean z) {
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
        this.items = immutableCopyOf(builder.items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Discover> {
        public List<DiscoverItem> items;
        public Long mid;
        public String more_link;
        public String more_text;
        public String title;

        public Builder() {
        }

        public Builder(Discover discover) {
            super(discover);
            if (discover != null) {
                this.mid = discover.mid;
                this.title = discover.title;
                this.more_text = discover.more_text;
                this.more_link = discover.more_link;
                this.items = Discover.copyOf(discover.items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Discover build(boolean z) {
            return new Discover(this, z, null);
        }
    }
}
