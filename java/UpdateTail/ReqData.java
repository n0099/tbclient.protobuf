package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final String DEFAULT_TAILCONTENT = "";
    public static final Integer DEFAULT_TAILID = 0;
    @ProtoField(tag = 5)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14725common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tailContent;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tailId;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tailContent == null) {
                this.tailContent = "";
            } else {
                this.tailContent = builder.tailContent;
            }
            if (builder.tailId == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = builder.tailId;
            }
            if (builder.fontColor == null) {
                this.fontColor = "";
            } else {
                this.fontColor = builder.fontColor;
            }
            if (builder.fontKeyName == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = builder.fontKeyName;
            }
            this.f14725common = builder.f14726common;
            return;
        }
        this.tailContent = builder.tailContent;
        this.tailId = builder.tailId;
        this.fontColor = builder.fontColor;
        this.fontKeyName = builder.fontKeyName;
        this.f14725common = builder.f14726common;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14726common;
        public String fontColor;
        public String fontKeyName;
        public String tailContent;
        public Integer tailId;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.tailContent = reqData.tailContent;
                this.tailId = reqData.tailId;
                this.fontColor = reqData.fontColor;
                this.fontKeyName = reqData.fontKeyName;
                this.f14726common = reqData.f14725common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
