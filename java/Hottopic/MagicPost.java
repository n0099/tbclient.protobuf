package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class MagicPost extends Message {
    public static final String DEFAULT_MAGIC_TITLE = "";
    public static final List<MagicPostList> DEFAULT_MC_POST_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String magic_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<MagicPostList> mc_post_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MagicPost> {
        public String magic_title;
        public List<MagicPostList> mc_post_list;

        public Builder() {
        }

        public Builder(MagicPost magicPost) {
            super(magicPost);
            if (magicPost == null) {
                return;
            }
            this.magic_title = magicPost.magic_title;
            this.mc_post_list = Message.copyOf(magicPost.mc_post_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MagicPost build(boolean z) {
            return new MagicPost(this, z);
        }
    }

    public MagicPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.magic_title;
            if (str == null) {
                this.magic_title = "";
            } else {
                this.magic_title = str;
            }
            List<MagicPostList> list = builder.mc_post_list;
            if (list == null) {
                this.mc_post_list = DEFAULT_MC_POST_LIST;
                return;
            } else {
                this.mc_post_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.magic_title = builder.magic_title;
        this.mc_post_list = Message.immutableCopyOf(builder.mc_post_list);
    }
}
