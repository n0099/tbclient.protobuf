package tbclient;

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
/* loaded from: classes9.dex */
public final class ActHot extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_IMG_DES = "";
    public static final String DEFAULT_IMG_SRC = "";
    public static final Integer DEFAULT_IMG_TYPE;
    public static final String DEFAULT_LINK = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String img_des;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_src;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer img_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String author_name;
        public String bsize;
        public String img_des;
        public String img_src;
        public Integer img_type;
        public String link;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ActHot actHot) {
            super(actHot);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {actHot};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (actHot == null) {
                return;
            }
            this.bsize = actHot.bsize;
            this.img_src = actHot.img_src;
            this.link = actHot.link;
            this.author_name = actHot.author_name;
            this.img_des = actHot.img_des;
            this.img_type = actHot.img_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActHot build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ActHot(this, z, null);
            }
            return (ActHot) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1015401194, "Ltbclient/ActHot;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1015401194, "Ltbclient/ActHot;");
                return;
            }
        }
        DEFAULT_IMG_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActHot(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.bsize;
            if (str == null) {
                this.bsize = "";
            } else {
                this.bsize = str;
            }
            String str2 = builder.img_src;
            if (str2 == null) {
                this.img_src = "";
            } else {
                this.img_src = str2;
            }
            String str3 = builder.link;
            if (str3 == null) {
                this.link = "";
            } else {
                this.link = str3;
            }
            String str4 = builder.author_name;
            if (str4 == null) {
                this.author_name = "";
            } else {
                this.author_name = str4;
            }
            String str5 = builder.img_des;
            if (str5 == null) {
                this.img_des = "";
            } else {
                this.img_des = str5;
            }
            Integer num = builder.img_type;
            if (num == null) {
                this.img_type = DEFAULT_IMG_TYPE;
                return;
            } else {
                this.img_type = num;
                return;
            }
        }
        this.bsize = builder.bsize;
        this.img_src = builder.img_src;
        this.link = builder.link;
        this.author_name = builder.author_name;
        this.img_des = builder.img_des;
        this.img_type = builder.img_type;
    }

    public /* synthetic */ ActHot(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
