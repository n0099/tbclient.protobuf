package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumCreateInfo;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_MSIGN_TEXT = "";
    @ProtoField(tag = 3)
    public final ForumCreateInfo forum_create_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<HotSearch> hot_search;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_login;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<LikeForum> like_forum;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer msign_level;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String msign_text;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer msign_valid;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadInfo> voice_room_list;
    public static final List<HotSearch> DEFAULT_HOT_SEARCH = Collections.emptyList();
    public static final List<LikeForum> DEFAULT_LIKE_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_IS_LOGIN = 0;
    public static final Integer DEFAULT_MSIGN_VALID = 0;
    public static final Integer DEFAULT_MSIGN_LEVEL = 0;
    public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ForumCreateInfo forum_create_info;
        public List<HotSearch> hot_search;
        public Integer is_login;
        public List<LikeForum> like_forum;
        public Integer msign_level;
        public String msign_text;
        public Integer msign_valid;
        public List<ThreadInfo> voice_room_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.hot_search = Message.copyOf(dataRes.hot_search);
            this.like_forum = Message.copyOf(dataRes.like_forum);
            this.forum_create_info = dataRes.forum_create_info;
            this.is_login = dataRes.is_login;
            this.msign_valid = dataRes.msign_valid;
            this.msign_text = dataRes.msign_text;
            this.msign_level = dataRes.msign_level;
            this.voice_room_list = Message.copyOf(dataRes.voice_room_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<HotSearch> list = builder.hot_search;
            if (list == null) {
                this.hot_search = DEFAULT_HOT_SEARCH;
            } else {
                this.hot_search = Message.immutableCopyOf(list);
            }
            List<LikeForum> list2 = builder.like_forum;
            if (list2 == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = Message.immutableCopyOf(list2);
            }
            this.forum_create_info = builder.forum_create_info;
            Integer num = builder.is_login;
            if (num == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = num;
            }
            Integer num2 = builder.msign_valid;
            if (num2 == null) {
                this.msign_valid = DEFAULT_MSIGN_VALID;
            } else {
                this.msign_valid = num2;
            }
            String str = builder.msign_text;
            if (str == null) {
                this.msign_text = "";
            } else {
                this.msign_text = str;
            }
            Integer num3 = builder.msign_level;
            if (num3 == null) {
                this.msign_level = DEFAULT_MSIGN_LEVEL;
            } else {
                this.msign_level = num3;
            }
            List<ThreadInfo> list3 = builder.voice_room_list;
            if (list3 == null) {
                this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
                return;
            } else {
                this.voice_room_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.hot_search = Message.immutableCopyOf(builder.hot_search);
        this.like_forum = Message.immutableCopyOf(builder.like_forum);
        this.forum_create_info = builder.forum_create_info;
        this.is_login = builder.is_login;
        this.msign_valid = builder.msign_valid;
        this.msign_text = builder.msign_text;
        this.msign_level = builder.msign_level;
        this.voice_room_list = Message.immutableCopyOf(builder.voice_room_list);
    }
}
