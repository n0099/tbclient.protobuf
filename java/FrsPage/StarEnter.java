package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class StarEnter extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer weight;
    public static final Integer DEFAULT_WEIGHT = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TIME = 0;

    /* synthetic */ StarEnter(Builder builder, boolean z, StarEnter starEnter) {
        this(builder, z);
    }

    private StarEnter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.weight == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = builder.weight;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = builder.time;
                return;
            }
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.weight = builder.weight;
        this.type = builder.type;
        this.url = builder.url;
        this.time = builder.time;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<StarEnter> {
        public String icon;
        public Integer time;
        public String title;
        public Integer type;
        public String url;
        public Integer weight;

        public Builder(StarEnter starEnter) {
            super(starEnter);
            if (starEnter != null) {
                this.icon = starEnter.icon;
                this.title = starEnter.title;
                this.weight = starEnter.weight;
                this.type = starEnter.type;
                this.url = starEnter.url;
                this.time = starEnter.time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarEnter build(boolean z) {
            return new StarEnter(this, z, null);
        }
    }
}
