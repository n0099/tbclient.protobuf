package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class MagicPost extends Message {
    public static final String DEFAULT_MAGIC_TITLE = "";
    public static final List<MagicPostList> DEFAULT_MC_POST_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String magic_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<MagicPostList> mc_post_list;

    private MagicPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.magic_title == null) {
                this.magic_title = "";
            } else {
                this.magic_title = builder.magic_title;
            }
            if (builder.mc_post_list == null) {
                this.mc_post_list = DEFAULT_MC_POST_LIST;
                return;
            } else {
                this.mc_post_list = immutableCopyOf(builder.mc_post_list);
                return;
            }
        }
        this.magic_title = builder.magic_title;
        this.mc_post_list = immutableCopyOf(builder.mc_post_list);
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<MagicPost> {
        public String magic_title;
        public List<MagicPostList> mc_post_list;

        public Builder() {
        }

        public Builder(MagicPost magicPost) {
            super(magicPost);
            if (magicPost != null) {
                this.magic_title = magicPost.magic_title;
                this.mc_post_list = MagicPost.copyOf(magicPost.mc_post_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MagicPost build(boolean z) {
            return new MagicPost(this, z);
        }
    }
}
