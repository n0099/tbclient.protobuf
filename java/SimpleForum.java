package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class SimpleForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final String DEFAULT_FORUM_TOUTU = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_RECOMMEND_TIP = "";
    public static final String DEFAULT_SECOND_CLASS = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 17)
    public final DeletedReasonInfo deleted_reason_info;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String forum_toutu;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_exists;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_frs_mask;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_liked;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_signed;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer member_num;
    @ProtoField(tag = 11)
    public final MultiForumPerm multi_forum_perm;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(label = Message.Label.REPEATED, tag = 21, type = Message.Datatype.STRING)
    public final List<String> pendants;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String recommend_tip;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String second_class;
    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<FrsTabInfo> tab_info;
    @ProtoField(tag = 19)
    public final ThemeColorInfo theme_color;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IS_EXISTS = 0;
    public static final Integer DEFAULT_IS_LIKED = 0;
    public static final Integer DEFAULT_IS_SIGNED = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_MEMBER_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_BRAND_FORUM = 0;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_FRS_MASK = 0;
    public static final List<String> DEFAULT_PENDANTS = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SimpleForum> {
        public String avatar;
        public DeletedReasonInfo deleted_reason_info;
        public String ext;
        public String first_class;
        public String forum_toutu;
        public Long id;
        public Integer is_brand_forum;
        public Integer is_exists;
        public Integer is_frs_mask;
        public Integer is_liked;
        public Integer is_signed;
        public Integer level_id;
        public Integer member_num;
        public MultiForumPerm multi_forum_perm;
        public String name;
        public List<String> pendants;
        public Integer post_num;
        public String recommend_tip;
        public String second_class;
        public List<FrsTabInfo> tab_info;
        public ThemeColorInfo theme_color;

        public Builder() {
        }

        public Builder(SimpleForum simpleForum) {
            super(simpleForum);
            if (simpleForum == null) {
                return;
            }
            this.id = simpleForum.id;
            this.name = simpleForum.name;
            this.is_exists = simpleForum.is_exists;
            this.avatar = simpleForum.avatar;
            this.is_liked = simpleForum.is_liked;
            this.is_signed = simpleForum.is_signed;
            this.first_class = simpleForum.first_class;
            this.second_class = simpleForum.second_class;
            this.ext = simpleForum.ext;
            this.level_id = simpleForum.level_id;
            this.multi_forum_perm = simpleForum.multi_forum_perm;
            this.member_num = simpleForum.member_num;
            this.post_num = simpleForum.post_num;
            this.is_brand_forum = simpleForum.is_brand_forum;
            this.tab_info = Message.copyOf(simpleForum.tab_info);
            this.forum_toutu = simpleForum.forum_toutu;
            this.deleted_reason_info = simpleForum.deleted_reason_info;
            this.is_frs_mask = simpleForum.is_frs_mask;
            this.theme_color = simpleForum.theme_color;
            this.recommend_tip = simpleForum.recommend_tip;
            this.pendants = Message.copyOf(simpleForum.pendants);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleForum build(boolean z) {
            return new SimpleForum(this, z);
        }
    }

    public SimpleForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.is_exists;
            if (num == null) {
                this.is_exists = DEFAULT_IS_EXISTS;
            } else {
                this.is_exists = num;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num2 = builder.is_liked;
            if (num2 == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = num2;
            }
            Integer num3 = builder.is_signed;
            if (num3 == null) {
                this.is_signed = DEFAULT_IS_SIGNED;
            } else {
                this.is_signed = num3;
            }
            String str3 = builder.first_class;
            if (str3 == null) {
                this.first_class = "";
            } else {
                this.first_class = str3;
            }
            String str4 = builder.second_class;
            if (str4 == null) {
                this.second_class = "";
            } else {
                this.second_class = str4;
            }
            String str5 = builder.ext;
            if (str5 == null) {
                this.ext = "";
            } else {
                this.ext = str5;
            }
            Integer num4 = builder.level_id;
            if (num4 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num4;
            }
            this.multi_forum_perm = builder.multi_forum_perm;
            Integer num5 = builder.member_num;
            if (num5 == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = num5;
            }
            Integer num6 = builder.post_num;
            if (num6 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num6;
            }
            Integer num7 = builder.is_brand_forum;
            if (num7 == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = num7;
            }
            List<FrsTabInfo> list = builder.tab_info;
            if (list == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list);
            }
            String str6 = builder.forum_toutu;
            if (str6 == null) {
                this.forum_toutu = "";
            } else {
                this.forum_toutu = str6;
            }
            this.deleted_reason_info = builder.deleted_reason_info;
            Integer num8 = builder.is_frs_mask;
            if (num8 == null) {
                this.is_frs_mask = DEFAULT_IS_FRS_MASK;
            } else {
                this.is_frs_mask = num8;
            }
            this.theme_color = builder.theme_color;
            String str7 = builder.recommend_tip;
            if (str7 == null) {
                this.recommend_tip = "";
            } else {
                this.recommend_tip = str7;
            }
            List<String> list2 = builder.pendants;
            if (list2 == null) {
                this.pendants = DEFAULT_PENDANTS;
                return;
            } else {
                this.pendants = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.is_exists = builder.is_exists;
        this.avatar = builder.avatar;
        this.is_liked = builder.is_liked;
        this.is_signed = builder.is_signed;
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
        this.ext = builder.ext;
        this.level_id = builder.level_id;
        this.multi_forum_perm = builder.multi_forum_perm;
        this.member_num = builder.member_num;
        this.post_num = builder.post_num;
        this.is_brand_forum = builder.is_brand_forum;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.forum_toutu = builder.forum_toutu;
        this.deleted_reason_info = builder.deleted_reason_info;
        this.is_frs_mask = builder.is_frs_mask;
        this.theme_color = builder.theme_color;
        this.recommend_tip = builder.recommend_tip;
        this.pendants = Message.immutableCopyOf(builder.pendants);
    }
}
