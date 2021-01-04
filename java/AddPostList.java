package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class AddPostList extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SubPostList> add_post_list;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer total_count;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer total_num;
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    public static final List<SubPostList> DEFAULT_ADD_POST_LIST = Collections.emptyList();

    private AddPostList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pid == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = builder.pid;
            }
            if (builder.total_num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = builder.total_num;
            }
            if (builder.total_count == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = builder.total_count;
            }
            if (builder.add_post_list == null) {
                this.add_post_list = DEFAULT_ADD_POST_LIST;
                return;
            } else {
                this.add_post_list = immutableCopyOf(builder.add_post_list);
                return;
            }
        }
        this.pid = builder.pid;
        this.total_num = builder.total_num;
        this.total_count = builder.total_count;
        this.add_post_list = immutableCopyOf(builder.add_post_list);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AddPostList> {
        public List<SubPostList> add_post_list;
        public Long pid;
        public Integer total_count;
        public Integer total_num;

        public Builder() {
        }

        public Builder(AddPostList addPostList) {
            super(addPostList);
            if (addPostList != null) {
                this.pid = addPostList.pid;
                this.total_num = addPostList.total_num;
                this.total_count = addPostList.total_count;
                this.add_post_list = AddPostList.copyOf(addPostList.add_post_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPostList build(boolean z) {
            return new AddPostList(this, z);
        }
    }
}
