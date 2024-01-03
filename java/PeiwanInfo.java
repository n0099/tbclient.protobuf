package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class PeiwanInfo extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_EXTENSION_INFO = "";
    public static final String DEFAULT_ROOM_STATUS_TEXT = "";
    public static final String DEFAULT_SCHEME = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String extension_info;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long room_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer room_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String room_status_text;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadRecommendTag> tag_list;
    @ProtoField(tag = 3)
    public final Voice voice;
    public static final Integer DEFAULT_ROOM_STATUS = 0;
    public static final List<ThreadRecommendTag> DEFAULT_TAG_LIST = Collections.emptyList();
    public static final Long DEFAULT_ROOM_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PeiwanInfo> {
        public String cover;
        public String extension_info;
        public Long room_id;
        public Integer room_status;
        public String room_status_text;
        public String scheme;
        public List<ThreadRecommendTag> tag_list;
        public Voice voice;

        public Builder() {
        }

        public Builder(PeiwanInfo peiwanInfo) {
            super(peiwanInfo);
            if (peiwanInfo == null) {
                return;
            }
            this.room_status = peiwanInfo.room_status;
            this.room_status_text = peiwanInfo.room_status_text;
            this.voice = peiwanInfo.voice;
            this.tag_list = Message.copyOf(peiwanInfo.tag_list);
            this.scheme = peiwanInfo.scheme;
            this.extension_info = peiwanInfo.extension_info;
            this.cover = peiwanInfo.cover;
            this.room_id = peiwanInfo.room_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PeiwanInfo build(boolean z) {
            return new PeiwanInfo(this, z);
        }
    }

    public PeiwanInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.room_status;
            if (num == null) {
                this.room_status = DEFAULT_ROOM_STATUS;
            } else {
                this.room_status = num;
            }
            String str = builder.room_status_text;
            if (str == null) {
                this.room_status_text = "";
            } else {
                this.room_status_text = str;
            }
            this.voice = builder.voice;
            List<ThreadRecommendTag> list = builder.tag_list;
            if (list == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.scheme;
            if (str2 == null) {
                this.scheme = "";
            } else {
                this.scheme = str2;
            }
            String str3 = builder.extension_info;
            if (str3 == null) {
                this.extension_info = "";
            } else {
                this.extension_info = str3;
            }
            String str4 = builder.cover;
            if (str4 == null) {
                this.cover = "";
            } else {
                this.cover = str4;
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
        this.room_status = builder.room_status;
        this.room_status_text = builder.room_status_text;
        this.voice = builder.voice;
        this.tag_list = Message.immutableCopyOf(builder.tag_list);
        this.scheme = builder.scheme;
        this.extension_info = builder.extension_info;
        this.cover = builder.cover;
        this.room_id = builder.room_id;
    }
}
