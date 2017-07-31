package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Shelf extends Message {
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String cover_img;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer first_chapter_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_chapter;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long update_time;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final Integer DEFAULT_TOTAL_CHAPTER = 0;
    public static final Integer DEFAULT_FIRST_CHAPTER_ID = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;

    private Shelf(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.cartoon_id == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = builder.cartoon_id;
            }
            if (builder.cartoon_name == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = builder.cartoon_name;
            }
            if (builder.total_chapter == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
            } else {
                this.total_chapter = builder.total_chapter;
            }
            if (builder.first_chapter_id == null) {
                this.first_chapter_id = DEFAULT_FIRST_CHAPTER_ID;
            } else {
                this.first_chapter_id = builder.first_chapter_id;
            }
            if (builder.cover_img == null) {
                this.cover_img = "";
            } else {
                this.cover_img = builder.cover_img;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
                return;
            } else {
                this.update_time = builder.update_time;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.total_chapter = builder.total_chapter;
        this.first_chapter_id = builder.first_chapter_id;
        this.cover_img = builder.cover_img;
        this.update_time = builder.update_time;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Shelf> {
        public Long cartoon_id;
        public String cartoon_name;
        public String cover_img;
        public Integer first_chapter_id;
        public Long forum_id;
        public Integer total_chapter;
        public Long update_time;

        public Builder() {
        }

        public Builder(Shelf shelf) {
            super(shelf);
            if (shelf != null) {
                this.forum_id = shelf.forum_id;
                this.cartoon_id = shelf.cartoon_id;
                this.cartoon_name = shelf.cartoon_name;
                this.total_chapter = shelf.total_chapter;
                this.first_chapter_id = shelf.first_chapter_id;
                this.cover_img = shelf.cover_img;
                this.update_time = shelf.update_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Shelf build(boolean z) {
            return new Shelf(this, z);
        }
    }
}
