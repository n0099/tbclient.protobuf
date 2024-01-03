package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedRoomComponent extends Message {
    public static final String DEFAULT_COVER_URL = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_TOP_LABEL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadRecommendTag> bottom_labels;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String cover_url;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long room_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String top_label;
    @ProtoField(tag = 3)
    public final Voice voice;
    public static final Integer DEFAULT_STATUS = 0;
    public static final List<ThreadRecommendTag> DEFAULT_BOTTOM_LABELS = Collections.emptyList();
    public static final Long DEFAULT_ROOM_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedRoomComponent> {
        public List<ThreadRecommendTag> bottom_labels;
        public String cover_url;
        public Long room_id;
        public String scheme;
        public Integer status;
        public String top_label;
        public Voice voice;

        public Builder() {
        }

        public Builder(FeedRoomComponent feedRoomComponent) {
            super(feedRoomComponent);
            if (feedRoomComponent == null) {
                return;
            }
            this.top_label = feedRoomComponent.top_label;
            this.status = feedRoomComponent.status;
            this.voice = feedRoomComponent.voice;
            this.bottom_labels = Message.copyOf(feedRoomComponent.bottom_labels);
            this.scheme = feedRoomComponent.scheme;
            this.cover_url = feedRoomComponent.cover_url;
            this.room_id = feedRoomComponent.room_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedRoomComponent build(boolean z) {
            return new FeedRoomComponent(this, z);
        }
    }

    public FeedRoomComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.top_label;
            if (str == null) {
                this.top_label = "";
            } else {
                this.top_label = str;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            this.voice = builder.voice;
            List<ThreadRecommendTag> list = builder.bottom_labels;
            if (list == null) {
                this.bottom_labels = DEFAULT_BOTTOM_LABELS;
            } else {
                this.bottom_labels = Message.immutableCopyOf(list);
            }
            String str2 = builder.scheme;
            if (str2 == null) {
                this.scheme = "";
            } else {
                this.scheme = str2;
            }
            String str3 = builder.cover_url;
            if (str3 == null) {
                this.cover_url = "";
            } else {
                this.cover_url = str3;
            }
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
                return;
            } else {
                this.room_id = l;
                return;
            }
        }
        this.top_label = builder.top_label;
        this.status = builder.status;
        this.voice = builder.voice;
        this.bottom_labels = Message.immutableCopyOf(builder.bottom_labels);
        this.scheme = builder.scheme;
        this.cover_url = builder.cover_url;
        this.room_id = builder.room_id;
    }
}
