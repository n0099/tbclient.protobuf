package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class StarEnter extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer rank_num;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String text;
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
    public static final Integer DEFAULT_RANK_NUM = 0;

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
            } else {
                this.time = builder.time;
            }
            if (builder.obj_id == null) {
                this.obj_id = "";
            } else {
                this.obj_id = builder.obj_id;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.rank_num == null) {
                this.rank_num = DEFAULT_RANK_NUM;
                return;
            } else {
                this.rank_num = builder.rank_num;
                return;
            }
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.weight = builder.weight;
        this.type = builder.type;
        this.url = builder.url;
        this.time = builder.time;
        this.obj_id = builder.obj_id;
        this.text = builder.text;
        this.rank_num = builder.rank_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<StarEnter> {
        public String icon;
        public String obj_id;
        public Integer rank_num;
        public String text;
        public Integer time;
        public String title;
        public Integer type;
        public String url;
        public Integer weight;

        public Builder() {
        }

        public Builder(StarEnter starEnter) {
            super(starEnter);
            if (starEnter != null) {
                this.icon = starEnter.icon;
                this.title = starEnter.title;
                this.weight = starEnter.weight;
                this.type = starEnter.type;
                this.url = starEnter.url;
                this.time = starEnter.time;
                this.obj_id = starEnter.obj_id;
                this.text = starEnter.text;
                this.rank_num = starEnter.rank_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarEnter build(boolean z) {
            return new StarEnter(this, z, null);
        }
    }
}
