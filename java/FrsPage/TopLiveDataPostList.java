package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TopLiveDataPostList extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_NICKNAME = "";
    public static final String DEFAULT_SEQ_ID = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String nickname;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String seq_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TopLiveDataPostList> {
        public String content;
        public String nickname;
        public String seq_id;

        public Builder() {
        }

        public Builder(TopLiveDataPostList topLiveDataPostList) {
            super(topLiveDataPostList);
            if (topLiveDataPostList == null) {
                return;
            }
            this.nickname = topLiveDataPostList.nickname;
            this.content = topLiveDataPostList.content;
            this.seq_id = topLiveDataPostList.seq_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopLiveDataPostList build(boolean z) {
            return new TopLiveDataPostList(this, z);
        }
    }

    public TopLiveDataPostList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.nickname;
            if (str == null) {
                this.nickname = "";
            } else {
                this.nickname = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            String str3 = builder.seq_id;
            if (str3 == null) {
                this.seq_id = "";
                return;
            } else {
                this.seq_id = str3;
                return;
            }
        }
        this.nickname = builder.nickname;
        this.content = builder.content;
        this.seq_id = builder.seq_id;
    }
}
