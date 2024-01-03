package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class VoteSchema extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TEXT_AFTER_VOTE = "";
    public static final String DEFAULT_TEXT_BEFORE_VOTE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text_after_vote;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text_before_vote;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VoteSchema> {
        public String jump_url;
        public String text_after_vote;
        public String text_before_vote;

        public Builder() {
        }

        public Builder(VoteSchema voteSchema) {
            super(voteSchema);
            if (voteSchema == null) {
                return;
            }
            this.text_before_vote = voteSchema.text_before_vote;
            this.text_after_vote = voteSchema.text_after_vote;
            this.jump_url = voteSchema.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VoteSchema build(boolean z) {
            return new VoteSchema(this, z);
        }
    }

    public VoteSchema(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text_before_vote;
            if (str == null) {
                this.text_before_vote = "";
            } else {
                this.text_before_vote = str;
            }
            String str2 = builder.text_after_vote;
            if (str2 == null) {
                this.text_after_vote = "";
            } else {
                this.text_after_vote = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str3;
                return;
            }
        }
        this.text_before_vote = builder.text_before_vote;
        this.text_after_vote = builder.text_after_vote;
        this.jump_url = builder.jump_url;
    }
}
