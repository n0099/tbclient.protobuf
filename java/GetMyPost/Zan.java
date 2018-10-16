package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class Zan extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_liked;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer last_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.INT64)
    public final List<Long> liker_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer num;
    public static final Integer DEFAULT_NUM = 0;
    public static final Integer DEFAULT_IS_LIKED = 0;
    public static final Integer DEFAULT_LAST_TIME = 0;
    public static final List<Long> DEFAULT_LIKER_ID = Collections.emptyList();
    public static final Long DEFAULT_AUTHOR_ID = 0L;

    private Zan(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = builder.num;
            }
            if (builder.is_liked == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = builder.is_liked;
            }
            if (builder.last_time == null) {
                this.last_time = DEFAULT_LAST_TIME;
            } else {
                this.last_time = builder.last_time;
            }
            if (builder.liker_id == null) {
                this.liker_id = DEFAULT_LIKER_ID;
            } else {
                this.liker_id = immutableCopyOf(builder.liker_id);
            }
            if (builder.author_id == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
                return;
            } else {
                this.author_id = builder.author_id;
                return;
            }
        }
        this.num = builder.num;
        this.is_liked = builder.is_liked;
        this.last_time = builder.last_time;
        this.liker_id = immutableCopyOf(builder.liker_id);
        this.author_id = builder.author_id;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Zan> {
        public Long author_id;
        public Integer is_liked;
        public Integer last_time;
        public List<Long> liker_id;
        public Integer num;

        public Builder() {
        }

        public Builder(Zan zan) {
            super(zan);
            if (zan != null) {
                this.num = zan.num;
                this.is_liked = zan.is_liked;
                this.last_time = zan.last_time;
                this.liker_id = Zan.copyOf(zan.liker_id);
                this.author_id = zan.author_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zan build(boolean z) {
            return new Zan(this, z);
        }
    }
}
