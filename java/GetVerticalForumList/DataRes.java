package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ClassForumInfo;
import tbclient.Page;
/* loaded from: classes16.dex */
public final class DataRes extends Message {
    public static final List<ClassForumInfo> DEFAULT_CLASS_FORUMINFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ClassForumInfo> class_foruminfo;
    @ProtoField(tag = 2)
    public final Page page;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.class_foruminfo == null) {
                this.class_foruminfo = DEFAULT_CLASS_FORUMINFO;
            } else {
                this.class_foruminfo = immutableCopyOf(builder.class_foruminfo);
            }
            this.page = builder.page;
            return;
        }
        this.class_foruminfo = immutableCopyOf(builder.class_foruminfo);
        this.page = builder.page;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ClassForumInfo> class_foruminfo;
        public Page page;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.class_foruminfo = DataRes.copyOf(dataRes.class_foruminfo);
                this.page = dataRes.page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
