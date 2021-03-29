package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class PostList extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 2)
    public final User author;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<MediaNum> media_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Voice> voice_info;
    public static final Long DEFAULT_ID = 0L;
    public static final List<Abstract> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final List<MediaNum> DEFAULT_MEDIA_NUM = Collections.emptyList();
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();
    public static final Long DEFAULT_AUTHOR_ID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PostList> {
        public List<Abstract> _abstract;
        public User author;
        public Long author_id;
        public Long id;
        public List<Media> media;
        public List<MediaNum> media_num;
        public List<Voice> voice_info;

        public Builder() {
        }

        public Builder(PostList postList) {
            super(postList);
            if (postList == null) {
                return;
            }
            this.id = postList.id;
            this.author = postList.author;
            this._abstract = Message.copyOf(postList._abstract);
            this.media = Message.copyOf(postList.media);
            this.media_num = Message.copyOf(postList.media_num);
            this.voice_info = Message.copyOf(postList.voice_info);
            this.author_id = postList.author_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostList build(boolean z) {
            return new PostList(this, z);
        }
    }

    public PostList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            this.author = builder.author;
            List<Abstract> list = builder._abstract;
            if (list == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list);
            }
            List<Media> list2 = builder.media;
            if (list2 == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list2);
            }
            List<MediaNum> list3 = builder.media_num;
            if (list3 == null) {
                this.media_num = DEFAULT_MEDIA_NUM;
            } else {
                this.media_num = Message.immutableCopyOf(list3);
            }
            List<Voice> list4 = builder.voice_info;
            if (list4 == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = Message.immutableCopyOf(list4);
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
                return;
            } else {
                this.author_id = l2;
                return;
            }
        }
        this.id = builder.id;
        this.author = builder.author;
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.media = Message.immutableCopyOf(builder.media);
        this.media_num = Message.immutableCopyOf(builder.media_num);
        this.voice_info = Message.immutableCopyOf(builder.voice_info);
        this.author_id = builder.author_id;
    }
}
