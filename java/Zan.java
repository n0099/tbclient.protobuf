package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Zan extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_liked;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer last_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.INT64)
    public final List<Long> liker_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> liker_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer num;
    public static final Integer DEFAULT_NUM = 0;
    public static final List<User> DEFAULT_LIKER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_LIKED = 0;
    public static final Integer DEFAULT_LAST_TIME = 0;
    public static final List<Long> DEFAULT_LIKER_ID = Collections.emptyList();

    /* synthetic */ Zan(Builder builder, boolean z, Zan zan) {
        this(builder, z);
    }

    private Zan(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = builder.num;
            }
            if (builder.liker_list == null) {
                this.liker_list = DEFAULT_LIKER_LIST;
            } else {
                this.liker_list = immutableCopyOf(builder.liker_list);
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
                return;
            } else {
                this.liker_id = immutableCopyOf(builder.liker_id);
                return;
            }
        }
        this.num = builder.num;
        this.liker_list = immutableCopyOf(builder.liker_list);
        this.is_liked = builder.is_liked;
        this.last_time = builder.last_time;
        this.liker_id = immutableCopyOf(builder.liker_id);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Zan> {
        public Integer is_liked;
        public Integer last_time;
        public List<Long> liker_id;
        public List<User> liker_list;
        public Integer num;

        public Builder() {
        }

        public Builder(Zan zan) {
            super(zan);
            if (zan != null) {
                this.num = zan.num;
                this.liker_list = Zan.copyOf(zan.liker_list);
                this.is_liked = zan.is_liked;
                this.last_time = zan.last_time;
                this.liker_id = Zan.copyOf(zan.liker_id);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zan build(boolean z) {
            return new Zan(this, z, null);
        }
    }
}
