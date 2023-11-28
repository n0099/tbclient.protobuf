package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class LiveModuleList extends Message {
    public static final String DEFAULT_BACKGROUND_URL = "";
    public static final String DEFAULT_FORUM_ID = "";
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_JUMP_TYPE = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_MODULE_DESC = "";
    public static final String DEFAULT_MODULE_SORT = "";
    public static final String DEFAULT_MODULE_TYPE = "";
    public static final String DEFAULT_TAG_TEXT = "";
    public static final String DEFAULT_TAG_TEXT_COLOR = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String background_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
    public final List<String> head_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String jump_type;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String module_desc;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> module_name;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String module_sort;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String module_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tag_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag_text_color;
    public static final List<String> DEFAULT_MODULE_NAME = Collections.emptyList();
    public static final List<String> DEFAULT_HEAD_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LiveModuleList> {
        public String background_url;
        public String forum_id;
        public List<String> head_list;
        public String id;
        public String jump_type;
        public String jump_url;
        public String module_desc;
        public List<String> module_name;
        public String module_sort;
        public String module_type;
        public String tag_text;
        public String tag_text_color;

        public Builder() {
        }

        public Builder(LiveModuleList liveModuleList) {
            super(liveModuleList);
            if (liveModuleList == null) {
                return;
            }
            this.id = liveModuleList.id;
            this.forum_id = liveModuleList.forum_id;
            this.module_type = liveModuleList.module_type;
            this.module_name = Message.copyOf(liveModuleList.module_name);
            this.module_desc = liveModuleList.module_desc;
            this.tag_text = liveModuleList.tag_text;
            this.tag_text_color = liveModuleList.tag_text_color;
            this.background_url = liveModuleList.background_url;
            this.head_list = Message.copyOf(liveModuleList.head_list);
            this.jump_type = liveModuleList.jump_type;
            this.jump_url = liveModuleList.jump_url;
            this.module_sort = liveModuleList.module_sort;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveModuleList build(boolean z) {
            return new LiveModuleList(this, z);
        }
    }

    public LiveModuleList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.id;
            if (str == null) {
                this.id = "";
            } else {
                this.id = str;
            }
            String str2 = builder.forum_id;
            if (str2 == null) {
                this.forum_id = "";
            } else {
                this.forum_id = str2;
            }
            String str3 = builder.module_type;
            if (str3 == null) {
                this.module_type = "";
            } else {
                this.module_type = str3;
            }
            List<String> list = builder.module_name;
            if (list == null) {
                this.module_name = DEFAULT_MODULE_NAME;
            } else {
                this.module_name = Message.immutableCopyOf(list);
            }
            String str4 = builder.module_desc;
            if (str4 == null) {
                this.module_desc = "";
            } else {
                this.module_desc = str4;
            }
            String str5 = builder.tag_text;
            if (str5 == null) {
                this.tag_text = "";
            } else {
                this.tag_text = str5;
            }
            String str6 = builder.tag_text_color;
            if (str6 == null) {
                this.tag_text_color = "";
            } else {
                this.tag_text_color = str6;
            }
            String str7 = builder.background_url;
            if (str7 == null) {
                this.background_url = "";
            } else {
                this.background_url = str7;
            }
            List<String> list2 = builder.head_list;
            if (list2 == null) {
                this.head_list = DEFAULT_HEAD_LIST;
            } else {
                this.head_list = Message.immutableCopyOf(list2);
            }
            String str8 = builder.jump_type;
            if (str8 == null) {
                this.jump_type = "";
            } else {
                this.jump_type = str8;
            }
            String str9 = builder.jump_url;
            if (str9 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str9;
            }
            String str10 = builder.module_sort;
            if (str10 == null) {
                this.module_sort = "";
                return;
            } else {
                this.module_sort = str10;
                return;
            }
        }
        this.id = builder.id;
        this.forum_id = builder.forum_id;
        this.module_type = builder.module_type;
        this.module_name = Message.immutableCopyOf(builder.module_name);
        this.module_desc = builder.module_desc;
        this.tag_text = builder.tag_text;
        this.tag_text_color = builder.tag_text_color;
        this.background_url = builder.background_url;
        this.head_list = Message.immutableCopyOf(builder.head_list);
        this.jump_type = builder.jump_type;
        this.jump_url = builder.jump_url;
        this.module_sort = builder.module_sort;
    }
}
