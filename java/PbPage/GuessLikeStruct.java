package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GuessLikeThreadInfo;
/* loaded from: classes.dex */
public final class GuessLikeStruct extends Message {
    public static final List<GuessLikeThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GuessLikeThreadInfo> thread_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    private GuessLikeStruct(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
                return;
            }
        }
        this.title = builder.title;
        this.thread_list = immutableCopyOf(builder.thread_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GuessLikeStruct> {
        public List<GuessLikeThreadInfo> thread_list;
        public String title;

        public Builder() {
        }

        public Builder(GuessLikeStruct guessLikeStruct) {
            super(guessLikeStruct);
            if (guessLikeStruct != null) {
                this.title = guessLikeStruct.title;
                this.thread_list = GuessLikeStruct.copyOf(guessLikeStruct.thread_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GuessLikeStruct build(boolean z) {
            return new GuessLikeStruct(this, z);
        }
    }
}
