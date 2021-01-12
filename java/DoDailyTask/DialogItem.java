package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DialogItem extends Message {
    public static final List<ButtonItem> DEFAULT_BUTTON = Collections.emptyList();
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ButtonItem> button;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    private DialogItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.button == null) {
                this.button = DEFAULT_BUTTON;
                return;
            } else {
                this.button = immutableCopyOf(builder.button);
                return;
            }
        }
        this.title = builder.title;
        this.content = builder.content;
        this.button = immutableCopyOf(builder.button);
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DialogItem> {
        public List<ButtonItem> button;
        public String content;
        public String title;

        public Builder() {
        }

        public Builder(DialogItem dialogItem) {
            super(dialogItem);
            if (dialogItem != null) {
                this.title = dialogItem.title;
                this.content = dialogItem.content;
                this.button = DialogItem.copyOf(dialogItem.button);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DialogItem build(boolean z) {
            return new DialogItem(this, z);
        }
    }
}
