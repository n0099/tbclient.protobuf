package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class SubPostList extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 9)
    public final Agree agree;
    @ProtoField(tag = 7)
    public final User author;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PbContent> content;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_author_view;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_fake_top;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_giftpost;
    @ProtoField(tag = 10)
    public final Lbs location;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_ID = 0L;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_TIME = 0;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Integer DEFAULT_FLOOR = 0;
    public static final Integer DEFAULT_IS_GIFTPOST = 0;
    public static final Integer DEFAULT_IS_FAKE_TOP = 0;
    public static final Integer DEFAULT_IS_AUTHOR_VIEW = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SubPostList> {
        public Agree agree;
        public User author;
        public Long author_id;
        public List<PbContent> content;
        public Integer floor;
        public Long id;
        public Integer is_author_view;
        public Integer is_fake_top;
        public Integer is_giftpost;
        public Lbs location;
        public Integer time;
        public String title;

        public Builder() {
        }

        public Builder(SubPostList subPostList) {
            super(subPostList);
            if (subPostList == null) {
                return;
            }
            this.id = subPostList.id;
            this.content = Message.copyOf(subPostList.content);
            this.time = subPostList.time;
            this.author_id = subPostList.author_id;
            this.title = subPostList.title;
            this.floor = subPostList.floor;
            this.author = subPostList.author;
            this.is_giftpost = subPostList.is_giftpost;
            this.agree = subPostList.agree;
            this.location = subPostList.location;
            this.is_fake_top = subPostList.is_fake_top;
            this.is_author_view = subPostList.is_author_view;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubPostList build(boolean z) {
            return new SubPostList(this, z);
        }
    }

    public SubPostList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num2;
            }
            this.author = builder.author;
            Integer num3 = builder.is_giftpost;
            if (num3 == null) {
                this.is_giftpost = DEFAULT_IS_GIFTPOST;
            } else {
                this.is_giftpost = num3;
            }
            this.agree = builder.agree;
            this.location = builder.location;
            Integer num4 = builder.is_fake_top;
            if (num4 == null) {
                this.is_fake_top = DEFAULT_IS_FAKE_TOP;
            } else {
                this.is_fake_top = num4;
            }
            Integer num5 = builder.is_author_view;
            if (num5 == null) {
                this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
                return;
            } else {
                this.is_author_view = num5;
                return;
            }
        }
        this.id = builder.id;
        this.content = Message.immutableCopyOf(builder.content);
        this.time = builder.time;
        this.author_id = builder.author_id;
        this.title = builder.title;
        this.floor = builder.floor;
        this.author = builder.author;
        this.is_giftpost = builder.is_giftpost;
        this.agree = builder.agree;
        this.location = builder.location;
        this.is_fake_top = builder.is_fake_top;
        this.is_author_view = builder.is_author_view;
    }
}
