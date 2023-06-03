package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.RecommendForumInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecommendForumInfo> forum_info;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> page_structure;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> second_class_list;
    public static final List<String> DEFAULT_PAGE_STRUCTURE = Collections.emptyList();
    public static final List<RecommendForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    public static final List<String> DEFAULT_SECOND_CLASS_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String class_name;
        public List<RecommendForumInfo> forum_info;
        public Page page;
        public List<String> page_structure;
        public List<String> second_class_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.page_structure = Message.copyOf(dataRes.page_structure);
            this.forum_info = Message.copyOf(dataRes.forum_info);
            this.page = dataRes.page;
            this.class_name = dataRes.class_name;
            this.second_class_list = Message.copyOf(dataRes.second_class_list);
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
            List<String> list = builder.page_structure;
            if (list == null) {
                this.page_structure = DEFAULT_PAGE_STRUCTURE;
            } else {
                this.page_structure = Message.immutableCopyOf(list);
            }
            List<RecommendForumInfo> list2 = builder.forum_info;
            if (list2 == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = Message.immutableCopyOf(list2);
            }
            this.page = builder.page;
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
            } else {
                this.class_name = str;
            }
            List<String> list3 = builder.second_class_list;
            if (list3 == null) {
                this.second_class_list = DEFAULT_SECOND_CLASS_LIST;
                return;
            } else {
                this.second_class_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.page_structure = Message.immutableCopyOf(builder.page_structure);
        this.forum_info = Message.immutableCopyOf(builder.forum_info);
        this.page = builder.page;
        this.class_name = builder.class_name;
        this.second_class_list = Message.immutableCopyOf(builder.second_class_list);
    }
}
