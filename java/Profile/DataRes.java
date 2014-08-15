package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.PostInfoList;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
    @ProtoField(tag = 2)
    public final Anti anti_stat;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PostInfoList> post_list;
    @ProtoField(tag = 3)
    public final TAInfo tainfo;
    @ProtoField(tag = 1)
    public final User user;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.anti_stat = builder.anti_stat;
            this.tainfo = builder.tainfo;
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
                return;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
                return;
            }
        }
        this.user = builder.user;
        this.anti_stat = builder.anti_stat;
        this.tainfo = builder.tainfo;
        this.post_list = immutableCopyOf(builder.post_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Anti anti_stat;
        public List<PostInfoList> post_list;
        public TAInfo tainfo;
        public User user;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.anti_stat = dataRes.anti_stat;
                this.tainfo = dataRes.tainfo;
                this.post_list = DataRes.copyOf(dataRes.post_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
