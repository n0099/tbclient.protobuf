package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class TogetherHi extends Message {
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final String DEFAULT_LOCATION = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer num_join;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num_signup;
    @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
    public final List<String> pic_urls;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> potraits;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer start_time;
    public static final Long DEFAULT_ALBUM_ID = 0L;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_NUM_SIGNUP = 0;
    public static final List<String> DEFAULT_POTRAITS = Collections.emptyList();
    public static final Integer DEFAULT_NUM_JOIN = 0;
    public static final List<String> DEFAULT_PIC_URLS = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TogetherHi> {
        public Long album_id;
        public String album_name;
        public Integer end_time;
        public String location;
        public Integer num_join;
        public Integer num_signup;
        public List<String> pic_urls;
        public List<String> potraits;
        public Integer start_time;

        public Builder() {
        }

        public Builder(TogetherHi togetherHi) {
            super(togetherHi);
            if (togetherHi == null) {
                return;
            }
            this.album_name = togetherHi.album_name;
            this.album_id = togetherHi.album_id;
            this.start_time = togetherHi.start_time;
            this.end_time = togetherHi.end_time;
            this.location = togetherHi.location;
            this.num_signup = togetherHi.num_signup;
            this.potraits = Message.copyOf(togetherHi.potraits);
            this.num_join = togetherHi.num_join;
            this.pic_urls = Message.copyOf(togetherHi.pic_urls);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TogetherHi build(boolean z) {
            return new TogetherHi(this, z);
        }
    }

    public TogetherHi(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.album_name;
            if (str == null) {
                this.album_name = "";
            } else {
                this.album_name = str;
            }
            Long l = builder.album_id;
            if (l == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = l;
            }
            Integer num = builder.start_time;
            if (num == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num;
            }
            Integer num2 = builder.end_time;
            if (num2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num2;
            }
            String str2 = builder.location;
            if (str2 == null) {
                this.location = "";
            } else {
                this.location = str2;
            }
            Integer num3 = builder.num_signup;
            if (num3 == null) {
                this.num_signup = DEFAULT_NUM_SIGNUP;
            } else {
                this.num_signup = num3;
            }
            List<String> list = builder.potraits;
            if (list == null) {
                this.potraits = DEFAULT_POTRAITS;
            } else {
                this.potraits = Message.immutableCopyOf(list);
            }
            Integer num4 = builder.num_join;
            if (num4 == null) {
                this.num_join = DEFAULT_NUM_JOIN;
            } else {
                this.num_join = num4;
            }
            List<String> list2 = builder.pic_urls;
            if (list2 == null) {
                this.pic_urls = DEFAULT_PIC_URLS;
                return;
            } else {
                this.pic_urls = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.album_name = builder.album_name;
        this.album_id = builder.album_id;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.location = builder.location;
        this.num_signup = builder.num_signup;
        this.potraits = Message.immutableCopyOf(builder.potraits);
        this.num_join = builder.num_join;
        this.pic_urls = Message.immutableCopyOf(builder.pic_urls);
    }
}
