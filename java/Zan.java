package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class Zan extends Message {
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer consent_type;
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
    public static final Integer DEFAULT_CONSENT_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Zan> {
        public Integer consent_type;
        public Integer is_liked;
        public Integer last_time;
        public List<Long> liker_id;
        public List<User> liker_list;
        public Integer num;

        public Builder() {
        }

        public Builder(Zan zan) {
            super(zan);
            if (zan == null) {
                return;
            }
            this.num = zan.num;
            this.liker_list = Message.copyOf(zan.liker_list);
            this.is_liked = zan.is_liked;
            this.last_time = zan.last_time;
            this.liker_id = Message.copyOf(zan.liker_id);
            this.consent_type = zan.consent_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zan build(boolean z) {
            return new Zan(this, z);
        }
    }

    public Zan(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
            }
            List<User> list = builder.liker_list;
            if (list == null) {
                this.liker_list = DEFAULT_LIKER_LIST;
            } else {
                this.liker_list = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.is_liked;
            if (num2 == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = num2;
            }
            Integer num3 = builder.last_time;
            if (num3 == null) {
                this.last_time = DEFAULT_LAST_TIME;
            } else {
                this.last_time = num3;
            }
            List<Long> list2 = builder.liker_id;
            if (list2 == null) {
                this.liker_id = DEFAULT_LIKER_ID;
            } else {
                this.liker_id = Message.immutableCopyOf(list2);
            }
            Integer num4 = builder.consent_type;
            if (num4 == null) {
                this.consent_type = DEFAULT_CONSENT_TYPE;
                return;
            } else {
                this.consent_type = num4;
                return;
            }
        }
        this.num = builder.num;
        this.liker_list = Message.immutableCopyOf(builder.liker_list);
        this.is_liked = builder.is_liked;
        this.last_time = builder.last_time;
        this.liker_id = Message.immutableCopyOf(builder.liker_id);
        this.consent_type = builder.consent_type;
    }
}
