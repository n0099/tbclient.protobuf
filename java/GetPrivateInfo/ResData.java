package tbclient.GetPrivateInfo;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SimpleUser;
/* loaded from: classes5.dex */
public final class ResData extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_BAZHU_SHOW_INSIDE;
    public static final Integer DEFAULT_BAZHU_SHOW_OUTSIDE;
    public static final Integer DEFAULT_FORUM_NUM;
    public static final Integer DEFAULT_GROUP;
    public static final Integer DEFAULT_LIKE;
    public static final Integer DEFAULT_LIVE;
    public static final Integer DEFAULT_LOCATION;
    public static final Integer DEFAULT_POST;
    public static final Integer DEFAULT_REPLY;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer bazhu_show_inside;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer bazhu_show_outside;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer forum_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer group;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer like;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer live;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer location;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer post;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer reply;
    @ProtoField(tag = 5)
    public final SimpleUser user;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer bazhu_show_inside;
        public Integer bazhu_show_outside;
        public Integer forum_num;
        public Integer group;
        public Integer like;
        public Integer live;
        public Integer location;
        public Integer post;
        public Integer reply;
        public SimpleUser user;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ResData resData) {
            super(resData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {resData};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (resData == null) {
                return;
            }
            this.location = resData.location;
            this.post = resData.post;
            this.like = resData.like;
            this.group = resData.group;
            this.user = resData.user;
            this.live = resData.live;
            this.forum_num = resData.forum_num;
            this.reply = resData.reply;
            this.bazhu_show_inside = resData.bazhu_show_inside;
            this.bazhu_show_outside = resData.bazhu_show_outside;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ResData(this, z, null) : (ResData) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1085806843, "Ltbclient/GetPrivateInfo/ResData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1085806843, "Ltbclient/GetPrivateInfo/ResData;");
                return;
            }
        }
        DEFAULT_LOCATION = 0;
        DEFAULT_POST = 0;
        DEFAULT_LIKE = 0;
        DEFAULT_GROUP = 0;
        DEFAULT_LIVE = 0;
        DEFAULT_FORUM_NUM = 0;
        DEFAULT_REPLY = 0;
        DEFAULT_BAZHU_SHOW_INSIDE = 0;
        DEFAULT_BAZHU_SHOW_OUTSIDE = 0;
    }

    public /* synthetic */ ResData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResData(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.location;
            if (num == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = num;
            }
            Integer num2 = builder.post;
            if (num2 == null) {
                this.post = DEFAULT_POST;
            } else {
                this.post = num2;
            }
            Integer num3 = builder.like;
            if (num3 == null) {
                this.like = DEFAULT_LIKE;
            } else {
                this.like = num3;
            }
            Integer num4 = builder.group;
            if (num4 == null) {
                this.group = DEFAULT_GROUP;
            } else {
                this.group = num4;
            }
            this.user = builder.user;
            Integer num5 = builder.live;
            if (num5 == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = num5;
            }
            Integer num6 = builder.forum_num;
            if (num6 == null) {
                this.forum_num = DEFAULT_FORUM_NUM;
            } else {
                this.forum_num = num6;
            }
            Integer num7 = builder.reply;
            if (num7 == null) {
                this.reply = DEFAULT_REPLY;
            } else {
                this.reply = num7;
            }
            Integer num8 = builder.bazhu_show_inside;
            if (num8 == null) {
                this.bazhu_show_inside = DEFAULT_BAZHU_SHOW_INSIDE;
            } else {
                this.bazhu_show_inside = num8;
            }
            Integer num9 = builder.bazhu_show_outside;
            if (num9 == null) {
                this.bazhu_show_outside = DEFAULT_BAZHU_SHOW_OUTSIDE;
                return;
            } else {
                this.bazhu_show_outside = num9;
                return;
            }
        }
        this.location = builder.location;
        this.post = builder.post;
        this.like = builder.like;
        this.group = builder.group;
        this.user = builder.user;
        this.live = builder.live;
        this.forum_num = builder.forum_num;
        this.reply = builder.reply;
        this.bazhu_show_inside = builder.bazhu_show_inside;
        this.bazhu_show_outside = builder.bazhu_show_outside;
    }
}
